/*
 * Copyright (C) 2015 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by Dalvik Fuzzer tool (3.4.001). Sun Dec 21 01:36:35 2014
package OptimizationTests.regression.test5006_2;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static int tzc=26607;

    public static long t2_check_sum = 0;

public static void t2(int ql) {

    byte mz=-22;
    int e=-15717, ibt=-20302, pb=-34560, bo=-28935, bnd[]=new int[N];
    long ae=-9081975983980329142L;
    float tg=123.182F;

    init(bnd, -4517);

    for (e = 5; e < 83; ++e) {
        ql -= (int)(tzc * (mz + (tg * ql)));
        ql += (-34288 + (e * e));
        bnd[e + 1] = (int)((ql = (int)tg) - ql);
        ql = (int)(ae++);
        bnd[e - 1] -= tzc;
    }
    for (ibt = 4; ibt < 80; ibt++) {
        for (pb = 5; pb < 89; pb++) {
            for (bo = 1; bo < 28; bo++) {
                tg *= -32057;
            }
            ae <<= ql;
            ql <<= (tzc - (bnd[ibt - 1] - (--ql)));
        }
    }
    t2_check_sum += ql + e + mz + Float.floatToIntBits(tg) + ae + ibt + pb + bo + checkSum(bnd);
}

public static void main(String[] k) {

    byte u=-12;
    int s=48595, fp6=29798, j=-23328, l=21040, i=45195, gpx=-52754, f[]=new int[N], ntn[]=new int[N], w[][]=new
        int[N][N];
    short h1v=32398;
    long wk=671584130019929456L, eyq[]=new long[N];
    double q=-38.922;
    float fc=-95.553F;

    init(eyq, -4499192496333226113L);
    init(f, 1813);
    init(ntn, 138);
    init(w, 33612);

    for (s = 3; s < 77; s++) {
        fp6 |= (int)(--wk);
        j = 1;
        do {
            l += (int)(((3573220156266350155L + q) * i) + (fp6--));
            l *= fp6;
            fp6 = (int)(((-1028 + eyq[j]) * (s - s)) * ((-41973 - (--l)) * (h1v += (short)fp6)));
        } while (++j < 2);
        l = ((fp6 -= (i = l)) - (-(i - i)));
        for (int xk : f) {
            gpx = (f[s + 1] + (++i));
            for (tzc = 1; tzc < 63; tzc++) {
                u -= (byte)gpx;
                u += (byte)((gpx * (++fc)) - (q * (++f[s])));
                ntn[tzc + 1] = (fp6--);
                w[s][s] = (++i);
                fp6 -= (int)(((xk - fc) - (-l)) + wk);
                gpx = (int)(wk--);
                fc *= (((++xk) + (fp6 + tzc)) - (wk * (i + tzc)));
                l += tzc;
            }
            gpx += (int)((long)((l + fc) + (xk + -73.524)) >> eyq[s + 1]);
            fc -= (fp6++);
            wk -= fp6;
            wk = (long)(((q + j) + (xk++)) - (fp6 * (wk / (s | 1))));
        }
        gpx = j;
    }
    t2(++gpx);
    f[(s >>> 1) % N] |= 5836;

    System.out.println("s fp6 wk = " + s + "," + fp6 + "," + wk);
    System.out.println("j l q = " + j + "," + l + "," + Double.doubleToLongBits(q));
    System.out.println("i h1v gpx = " + i + "," + h1v + "," + gpx);
    System.out.println("u fc eyq = " + u + "," + Float.floatToIntBits(fc) + "," + checkSum(eyq));
    System.out.println("f ntn w = " + checkSum(f) + "," + checkSum(ntn) + "," + checkSum(w));

    System.out.println("tzc = " + tzc);

    System.out.println("t2_check_sum: " + t2_check_sum);
}
}
