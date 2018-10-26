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

// Generated by Dalvik Fuzzer tool (2.1.003). Sun May 18 22:31:08 2014
package OptimizationTests.regression.test197090;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

public static final int N = 30;

public static long qk_check_sum = 0;
public static long e_check_sum = 0;

public static byte qk(int v, int f5w, int i1e, int kht) {

    long o[]=new long[N], v7[][]=new long[N][N];
    int d8f=36867, gb=-40053, a=-30896, u1=-3489, t=13127, f[]=new int[N], m[][]=new int[N][N], d[][]=new int[N][N],
        kop[]=new int[N];

    init(o, 7678629879538738017L);
    init(f, 2955);
    init(v7, 618675000598899850L);
    init(m, 22997);
    init(d, -18592);
    init(kop, -10030);


    for (d8f = 1; d8f < 3; ++d8f) {
        o[d8f-1] *= (long)(f[d8f+1]);

        if (v7[d8f][d8f+1] >= m[d8f][d8f+1]) {
            f[d8f] += (int)(d[d8f][d8f-1]);
        } else {
            gb -= (int)(a--);
        }

        kop[d8f-1] -= (int)(f[d8f-1]);
    }


    for (u1 = 1; u1 > 1; --u1) {
        kop[u1] -= (int)(--t);
    }

    long meth_res = v + f5w + i1e + kht + d8f + gb + a + u1 + t + checkSum(o) + checkSum(f) + checkSum(v7) +
        checkSum(m) + checkSum(d) + checkSum(kop);
    qk_check_sum += meth_res;
    return (byte)meth_res;
}

public static int e(byte e, long a, int d) {

    long y[][]=new long[N][N];
    int w9=-15622, r6=64409, nmo=3667, vy=42542, n=-24646, rh9=23528, cw=-33043, g=-22446, vr[][]=new int[N][N],
        ob[]=new int[N], k38[][]=new int[N][N];

    init(vr, -892);
    init(ob, -47842);
    init(k38, -5314);
    init(y, -4136117588146054395L);


    for (w9 = 1; w9 < 13; ++w9) {
        vr[w9-1][w9+1] = (int)(ob[w9]);
    }


    // Test Loop Interchange
    for (r6 = 1; r6 < 17; ++r6) {
        for (nmo = r6; nmo < 6; ++nmo) {
            k38[r6+1][nmo+1] = (int)(--vy);
        }
    }

    int a8 = 11;
    do {

        for (n = 1; n < 6; n++) {
            rh9 += (int)(y[n][n-1]);
        }


        for (cw = 1; cw < 7; cw++) {

            // Test Loop Vectorization
            for (g = 13; g > 1; g--) {
                ob[g-1] = (int)(13376);
                ob[g] += (int)(-ob[cw]);
            }

        }

    } while ( --a8 > 0 );

    long meth_res = e + a + d + w9 + r6 + nmo + vy + n + rh9 + cw + g + checkSum(vr) + checkSum(ob) + checkSum(k38) +
        checkSum(y);
    e_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] f8) {

    long pd7[][]=new long[N][N], m[]=new long[N], k[]=new long[N];
    int b=9650, x10=-11026, b6=3453, pxk=52858, i3b=-46349, c=-46935, zy=-43644, iqs=-33252, x[]=new int[N],
        mi0[][]=new int[N][N], ny[]=new int[N], t[][]=new int[N][N], lph[][]=new int[N][N], ez[]=new int[N],
        xo9[][]=new int[N][N], h9[]=new int[N], jlv[][]=new int[N][N];
    byte gr[][]=new byte[N][N];

    init(x, -41769);
    init(mi0, 44163);
    init(ny, -48470);
    init(t, 50540);
    init(lph, -4604);
    init(ez, -58751);
    init(pd7, -5230124541306458117L);
    init(gr, (byte)-4);
    init(xo9, -43679);
    init(h9, 40832);
    init(m, 8344071798702849290L);
    init(k, 7443967582138397619L);
    init(jlv, 19691);


    // Test Loop Vectorization
    for (b = 22; b > 1; --b) {
        x[b-1] = (int)(x[b-1] + x[b+1]);
    }


    for (x10 = 1; x10 < 12; x10++) {
        mi0[x10-1][x10-1] *= (int)(ny[x10+1]);

        if (t[x10-1][x10-1] >= lph[x10][x10+1]) {

            for (b6 = x10; b6 < 4; ++b6) {
                pxk *= (int)(++i3b);
                i3b += (int)((b + ((t[b6-1][x10-1]) - -60962)) - x10);

                // Test Loop Predication
                if (b6 != x10-3) {
                    c = (int)(ez[x10+1]);
                }

                pxk += (int)(qk((int)(mi0[b6+1][x10+1]), (int)(pd7[b6][x10]), (int)((gr[x10-1][x10]) -
                    (xo9[x10][x10])), (int)(ny[x10+1])));
                c *= (int)(qk((int)(h9[b6+1]), (int)(ez[b6-1]), (int)(ez[b6+1]), (int)(e((byte)((m[x10]) + (i3b)),
                    (long)(k[b6+1]), (int)(zy++)))));
            }


            // Test Loop Predication
            if (x10 < 5) {
                zy -= (int)(ez[x10+1]);
                c -= (int)(jlv[x10][x10+1]);
            }

        }


        // Test Loop Vectorization
        for (iqs = 12; iqs > 1; --iqs) {
            ny[x10] = (int)(x10);
        }

    }


    System.out.println("long: " + checkSum(pd7) + "," + checkSum(m) + "," + checkSum(k));
    System.out.println("int: " + b + "," + x10 + "," + b6 + "," + pxk + "," + i3b + "," + c + "," + zy + "," + iqs +
        "," + checkSum(x) + "," + checkSum(mi0) + "," + checkSum(ny) + "," + checkSum(t) + "," + checkSum(lph) + "," +
        checkSum(ez) + "," + checkSum(xo9) + "," + checkSum(h9) + "," + checkSum(jlv));
    System.out.println("byte: " + checkSum(gr));

    System.out.println("qk_check_sum: " + qk_check_sum);
    System.out.println("e_check_sum: " + e_check_sum);
}
}
