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

// Generated by Android Runtime Fuzzer tool (4.1.001). Tue Dec 15 23:30:59 2015
// srand = 9434015334192070428637805849346972784789800643194727656008384769986

package OptimizationTests.regression.test2978;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=248L;
    public static int iFld=-18020;

public static void main(String[] strArr) {

    long lArr[]=new long[N];
    short s=-4159;
    double d=-57.11467;
    float f=-1.362F;
    int i=-20817, i1=-14, i2=0, i3=45502, iArr[][]=new int[N][N];
    byte by=122;

    init(iArr, -10);
    init(lArr, 192L);

    for (i = 1; i < 97; i++) {
        i1 *= (int)((-(5112 * f)) % (iArr[i + 1][i] | 1));
        i2 = 1;
        do {
            lArr[i2 + 1] += lArr[i2 + 1];
            Main.instanceCount += (-53436L + (i2 * i2));
            f -= (++i1);
            Main.instanceCount = (Main.instanceCount + (Main.instanceCount++));
            i1 += (int)(((i1++) - (i2 - Main.instanceCount)) - (i1 >>= (i1 * by)));
            f += (float)(++d);
            i1 -= iArr[i][i + 1];
            i1 = 34765;
        } while (++i2 < i);
        switch (((((int)(Main.instanceCount + i2)) >>> 1) % 1) + 10) {
        case 10:
            i1 %= (int)((--i1) | 1);
            for (i3 = i; i3 < 34; i3 += 3) {
                s += (short)(i3 * i3);
                i1 += (i3 + i1);
                i1 = (int)(-(i - (d - i1)));
                f = i2;
                i1 = (s | i3);
                Main.iFld = i1;
            }
            break;
        }
        Main.iFld <<= (int)((--Main.instanceCount) - (-(i1 - -38373)));
        Main.instanceCount = (long)((++i1) - (d - i2));
        d += (Main.iFld++);
        iArr[i][i + 1] -= (int)(((Main.instanceCount * 1.79267) + (-(i1 + Main.instanceCount))) * -47);
        i1 <<= (((Main.iFld--) - (i - by)) * ((-45917 * (i + i3)) * (-45678 + (i1++))));
    }

    System.out.println("i i1 f = " + i + "," + i1 + "," + Float.floatToIntBits(f));
    System.out.println("i2 by d = " + i2 + "," + by + "," + Double.doubleToLongBits(d));
    System.out.println("i3 s iArr = " + i3 + "," + s + "," + checkSum(iArr));
    System.out.println("lArr = " + checkSum(lArr));

    System.out.println("Main.instanceCount Main.iFld = " + Main.instanceCount + "," + Main.iFld);
}
}
