package com.example.designpatterns.algorithm.hard;

import java.util.HashMap;
import java.util.Map;

public class SuperEggDrop {
    private static final Map<String, Integer> hashMap = new HashMap<>();
    private static int counter = 0;
    public static int superEggDrop(int k, int n) {
        return solve(k, n);
    }

    public static int solve(int k, int n){
        System.out.printf("[%d]: Solve for k = %d, n= %d%n", counter++, k, n);
        Integer cache = hashMap.get(k + "_" + n);
        if (cache != null){
            System.out.println("Hit cached!");
            return cache;
        }
        if (k == 1){
            hashMap.put(k + "_" + n, n);
            return n;
        }
        if (n == 1){
            hashMap.put(k + "_" + n, 1);
            return 1;
        }
        if (n == 2){
            hashMap.put(k + "_" + n, 2);
            return 2;
        }

        int pL = 2;
        int pH = (n+1)/2;

        if (pH == pL){
            int m1 = solve(k -1, pH -1);
            int m2 = solve(k, n - pH);
            int mH = 1 + Math.max(m1, m2);
            hashMap.put(k + "_" + pH, mH);
            return mH;
        }
        while (pL < pH){
            int mid = (pL + pH)/2;

            //Move at pMid
            int m1 = solve(k -1, mid -1);
            int m2 = solve(k, n - mid);
            int mMid = 1 + Math.max(m1, m2);
            hashMap.put(k + "_" + mid, mMid);

            //Move at pMid + 1
            int mid1 = mid + 1;
            m1 = solve(k -1, mid1 - 1);
            m2 = solve(k, n - mid1);
            int mMidPlus1 = 1 + Math.max(m1, m2);
            hashMap.put(k + "_" + mid1, mMidPlus1);

            if (mMid > mMidPlus1){
                pL = mid + 1;
            } else {
                pH = mid;
            }
        }
        return hashMap.get(k + "_" + pL);
    }

//    for (int mid = (n + 1)/2; mid >= 2; mid--){
//        int m1 = solve(k -1, mid -1);
//        if (m1 > min){
//            break;
//        }
//        int m2 = solve(k, n - mid);
//        if (m2 > min){
//            break;
//        }
//        min = Math.max(m1, m2);
//    }
    public static int solve2(int k, int n){
        System.out.printf("[%d]: Solve for k = %d, n= %d%n", counter++, k, n);
        if (k == 1){
            return n;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        Integer cache = hashMap.get(k + "_" + n);
        if (cache != null){
            System.out.println("Hit cached!");
            return cache;
        }
        int result;

        int pL = 2;
        int pH = (n+1)/2;

        //Move at pL
        int m1 = solve(k -1, pL -1);
        int m2 = solve(k, n - pL);
        int mL = Math.max(m1, m2);

        //Move at pH
        if (pH == pL){
            hashMap.put(k + "_" + n, mL);
            return mL;
        }
        m1 = solve(k -1, pH -1);
        m2 = solve(k, n - pH);
        int mH = Math.max(m1, m2);

        int pM;
        boolean isStop = false;
        while (pL <= pH && !isStop){
            if (pH == pL + 1){
                result = 1 + Math.min(mL, mH);
                hashMap.put(k + "_" + n, result);
                return result;
            }
            pM = (pL + pH)/2;

            //Move at pM
            m1 = solve(k -1, pM -1);
            m2 = solve(k, n - pM);
            int mM = Math.max(m1, m2);

            if (mM > mL && mM > mH){
                result = 1 + Math.min(mL, mH);
                hashMap.put(k + "_" + n, result);
                return result;
            }
            if (mM == mL){
                pL = pM;
            } else if (mM == mH){
                pH = pM;
            } else {
                int p1 = (pH + pM)/2;
                int t1;
                if (p1 == pM){
                    t1 = mM;
                } else {
                    m1 = solve(k -1, p1 -1);
                    m2 = solve(k, n - p1);
                    t1 = Math.max(m1, m2);
                }

                if (t1 < mH && t1 < mM){
                    pL = pM;
                } else {
                    pH = pM;
                }

            }
        }
        System.out.println("ERROR!");
        result = 1;
        return result;
    }
}
