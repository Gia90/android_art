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

// Generated by Dalvik Fuzzer tool (3.4.001). Thu Dec 25 18:18:02 2014
package OptimizationTests.regression.test1104;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static double h=-11.107;

public static void main(String[] us) {

    int d=50445, k=-56176, xd5=-34646, e=-52410, abt=46733, odz=21849, s5r[]=new int[N];
    short h1=-16107;
    double o=-34.425, rn[]=new double[N];
    long q=-8085516813229154574L, a3=-2314872246161741416L, xki[]=new long[N];
    float w=-116.745F, t=10.362F, c7[]=new float[N];

    init(xki, -7218774777003162414L);
    init(s5r, 39438);
    init(c7, -23.47F);
    init(rn, -110.808);

    for (w = 5; w < 96; w++) {
        d -= (int)((36341 + d) + (o--));
        q &= (d--);
        q += (d - xki[(int)(w)]);
        d = (int)(t++);
        k = 1;
        do {
            s5r[k - 1] <<= (int)((--t) - (-(-(-37313 * (xd5 - q)))));
            t *= d;
            o += k;
            d <<= h1;
            h1 *= (short)h;
            d += (int)((d - q) * (++t));
            e = 1;
            while (++e < k) {
                d *= (xd5 = (xd5 |= (++s5r[(-15754 >>> 1) % N])));
                c7[(int)(w + 1)] -= (++d);
                a3 = (((k * d) - (a3 &= e)) - (xd5--));
                xki[(int)(w + 1)] -= (k - (++xd5));
                rn[(int)(w)] -= (a3++);
                xd5 += (e | d);
                q *= q;
                q = abt;
            }
        } while (++k < 78);
        d = (int)a3;
        for (odz = 4; odz < 81; ++odz) {
            s5r[(int)(w - 1)] += (abt++);
            d >>= d;
        }
    }

    System.out.println("w d o = " + Float.floatToIntBits(w) + "," + d + "," + Double.doubleToLongBits(o));
    System.out.println("q t k = " + q + "," + Float.floatToIntBits(t) + "," + k);
    System.out.println("xd5 h1 e = " + xd5 + "," + h1 + "," + e);
    System.out.println("a3 abt odz = " + a3 + "," + abt + "," + odz);
    System.out.println("xki s5r c7 = " + checkSum(xki) + "," + checkSum(s5r) + "," +
        Double.doubleToLongBits(checkSum(c7)));
    System.out.println("rn = " + Double.doubleToLongBits(checkSum(rn)));

    System.out.println("h = " + Double.doubleToLongBits(h));
}
}
