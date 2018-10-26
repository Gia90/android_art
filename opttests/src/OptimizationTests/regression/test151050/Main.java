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

// Generated by Dalvik Fuzzer tool (2.1.003). Sat Nov  9 20:26:56 2013

package OptimizationTests.regression.test151050;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    static int statIntField = 3;

    static void statSet(int value) {
        statIntField = value;
    }

    static int statGet() {
        return statIntField;
    }

    public static void main(String[] v4) {

        byte v[] = new byte[N];
        int o = -12708, vc = -10642, mg = -58597, mdh = -33537, eg = -44959, lqs = 12039, rlf = -24009, q = 21591, rll[][] = new int[N][N], m[][] = new int[N][N], i[][] = new int[N][N], nt0[] = new int[N], e5u[] = new int[N], t[][] = new int[N][N];
        long tg4[] = new long[N];

        init(rll, -48299);
        init(v, (byte) -25);
        init(m, -8488);
        init(tg4, 7078130773559836752L);
        init(i, 38959);
        init(nt0, 63950);
        init(e5u, 44030);
        init(t, -55518);

        for (o = 24; o > 1; --o) {
            for (vc = 1; vc < o; vc++) {
                rll[o + 1][vc - 1] = (int) (v[vc]);
            }
        }

//        int k5 = 11;
        int k5 = 1000;
        do {
            for (mg = 1; mg < 24; ++mg) {
                mdh = (int) (mg + mg);
                eg += (int) (m[mg][mg - 1]);
                if (mg > 0) {
                    lqs += (int) (statGet());
                    if (mg <= 3) {
                        for (long vh : tg4) {
                            i[mg + 1][mg] -= (int) (nt0[mg + 1]);
                            e5u[mg - 1] += (int) (++rlf);
                            nt0[mg - 1] += (int) (q--);
                        }
                        int a = 11;
                        do {
                            m[mg][mg + 1] += (int) ((((t[mg - 1][mg - 1]) - vc) - ((nt0[mg - 1]) + (mg))) - (i[mg - 1][mg]));
                        } while (--a > 0);
                    }
                }
            }
        } while (--k5 > 0);

        long res = checkSum(m);
        // System.out.println ("M: " + checkSum(m));
        if (res == -259093969) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED: expected res = -259093969; actual res = "
                    + res);
        }

    }
}
