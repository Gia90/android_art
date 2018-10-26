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

// Generated by Dalvik Fuzzer tool (3.4.001). Wed Nov 12 14:16:18 2014
package OptimizationTests.regression.test857;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

public static void main(String[] jv) {

    float jgp=62.48F;
    double e2=118.139;
    byte m=81, jxe[]=new byte[N];
    long l=951099867285381831L;
    int g=8817, s1k=-39487, j=20223, e19=41359, w1=-58744, t0a[]=new int[N];

    init(t0a, 64235);
    init(jxe, (byte)89);

    for (g = 92; g > 5; g--) {
        s1k += (((g * s1k) + s1k) - s1k);
        s1k >>= (int)l;
        s1k >>>= (int)((t0a[(s1k >>> 1) % N] * (e2++)) - (++s1k));
        t0a[g + 1] %= (int)((long)(((s1k - s1k) - (e2 - g)) * (t0a[g - 1] ^= (int)(g + l))) | 1);
        for (j = 1; j < 42; ++j) {
            l *= (((s1k--) >> (j * j)) - j);
            try {
                s1k = (int)(((g - 3065) + (jgp -= (float)106.113)) + (s1k * (j * l)));
            }
            catch (NegativeArraySizeException p8) {
                s1k = (int)(-((j * j) * (l + g)));
                s1k ^= s1k;
                s1k = 5494;
                jgp = (s1k--);
            }
            finally {
                t0a[j + 1] -= ((41857 >> s1k) - -8069);
            }
            s1k -= (int)l;
            l >>= ((l--) - (-s1k));
            jgp *= ((l--) + (g * (s1k - j)));
            jgp += (((l - -4208097326214271911L) - g) + jgp);
            for (e19 = 1; e19 < g; e19++) {
                s1k += (e19 * e19);
                s1k = (int)l;
                s1k += (int)e2;
                l = (-((--s1k) - (w1 - l)));
                t0a[g] = (m++);
                s1k = ((jxe[g + 1]--) * ((t0a[j + 1]--) + (j * w1)));
            }
        }
    }

    System.out.println("g s1k l = " + g + "," + s1k + "," + l);
    System.out.println("e2 j jgp = " + Double.doubleToLongBits(e2) + "," + j + "," + Float.floatToIntBits(jgp));
    System.out.println("e19 w1 m = " + e19 + "," + w1 + "," + m);
    System.out.println("t0a jxe = " + checkSum(t0a) + "," + checkSum(jxe));

}
}
