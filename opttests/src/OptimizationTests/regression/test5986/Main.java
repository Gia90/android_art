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

// Generated by Dalvik Fuzzer tool (3.4.001). Mon Oct 20 03:26:15 2014
package OptimizationTests.regression.test5986;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static void main(String[] n2) {

        short fc = 6567;
        float i = 120.857F, m7 = 58.777F;
        double b[] = new double[N];
        int p1 = -36708, f4u = -17747, t = 42825, suc = -54890;
        long yk6 = 5739285953971502099L;

        init(b, -113.674);

        for (p1 = 4; p1 < 96; ++p1) {
            for (f4u = 1; f4u < 36; f4u++) {
                for (i = 3; i < 86; ++i) {
                    yk6 >>>= (t = t);
                    suc += (int) i;
                    yk6 += (long) (f4u - ((++m7) + (yk6 - suc)));
                }
                yk6 |= (long) ((-(b[f4u + 1]--)) * yk6);
                t -= p1;
                suc += -24985;
                suc -= (int) (--yk6);
                t = (int) (p1 + ((p1 - 4393227720743696345L) << t));
                yk6 -= fc;
            }
        }

        System.out.println("yk6: " + yk6);
        System.out.println("suc: " + suc);

        System.out.println("p1: " + p1);
        System.out.println("f4u: " + f4u);
        System.out.println("i: " + Float.floatToIntBits(i));
        System.out.println("t: " + t);
        System.out.println("m7: " + Float.floatToIntBits(m7));
        System.out.println("fc: " + fc);
        System.out.println("b: " + Double.doubleToLongBits(checkSum(b)));
    }
}
