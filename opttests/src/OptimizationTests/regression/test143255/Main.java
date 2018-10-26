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

// Generated by Dalvik Fuzzer tool (2.1.003). Mon Oct  7 00:29:49 2013

package OptimizationTests.regression.test143255;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 30;

    public static long v_check_sum = 0;

    public static long v() {

        int e = -53772, z = 33726, l9[][] = new int[N][N], ap[] = new int[N];

        init(l9, 28462);
        init(ap, -18980);

        for (e = 1; e < 11; ++e) {
            for (z = e; z < 4; ++z) {
                l9[e - 1][e] -= (int) (ap[z]);
            }
        }
        long meth_res = e + z + checkSum(l9) + checkSum(ap);
        v_check_sum += meth_res;
        return (long) meth_res;
    }

    public static void main(String[] o) {

        int va = -6458, k9 = 6487, j = 54208, df = -21751, w2 = 48737, p = 5511, qk = -18701, vi = 4483, q = 64529, cgv[] = new int[N], br[] = new int[N], h[][] = new int[N][N];
        byte yg[][] = new byte[N][N];
        long y = 8439565060507416001L, up = 6377276501758653499L, kek[] = new long[N], ojk[] = new long[N];

        init(cgv, 27853);
        init(kek, -6644370208667657306L);
        init(br, -42973);
        init(ojk, 8233398530132334476L);
        init(yg, (byte) 84);
        init(h, 10795);

        for (va = 1; va < 11; va++) {
            cgv[va - 1] = (int) (cgv[va - 1] + cgv[va]);
            cgv[va] = (int) (-kek[va + 1]);
        }
        for (k9 = 1; k9 < 16; ++k9) {
            y = (long) (++j);
        }
        for (df = 1; df < 27; df++) {
            y = (long) (cgv[df]);
            br[df] -= (int) (w2++);
            for (p = 1; p < 2; p += 3) {
                br[p + 1] = (int) (kek[df] * ojk[df]);
                kek[df - 1] = (long) (ojk[df] + kek[df + 1]);
            }
            up = (long) ((j + j) + (yg[df - 1][df - 1]));
            if (df >= 0) {
                qk = (int) (yg[df][df - 1]);
                if (df <= 1) {
                } else {
                    for (vi = 7; vi > df; --vi) {
                        kek[vi - 1] = (long) (df);
                    }
                    if ((yg[df + 1][df + 1]) / ((df != 0) ? df : 1) <= --q) {
                        q += (int) ((h[df][df - 1]) * (v()));
                    }
                }
            }
        }

        System.out.println("int: " + va + "," + k9 + "," + j + "," + df + ","
                + w2 + "," + p + "," + qk + "," + vi + "," + q + ","
                + checkSum(cgv) + "," + checkSum(br) + "," + checkSum(h));
        System.out.println("byte: " + checkSum(yg));
        System.out.println("long: " + y + "," + up + "," + checkSum(kek) + ","
                + checkSum(ojk));

        System.out.println("v_check_sum: " + v_check_sum);
    }
}
