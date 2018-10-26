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

// Generated by Android Runtime Fuzzer tool (3.5.002). Fri Jul 31 14:25:52 2015
// srand = 26711841775805849612322400626955947746642311567827578815044413212630

package OptimizationTests.regression.test2416;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static int iFld=57423;

public static void main(String[] strArr) {

    double d=0.3329, d1=22.95217, dArr[]=new double[N];
    float f=1.895F, f1=7.54F;
    boolean b=false;
    long l=-71L;
    int i=10866, i1=-65, i2=7, i3=58450, i4=-40554, i5=-8, iArr[]=new int[N];
    short s=30995;

    init(iArr, -155);
    init(dArr, -1.88188);

    for (f = 2; f < 78; ++f) {
        iFld -= (++iArr[(int)(f + 1)]);
        l += (long)f;
        l += (iFld++);
        iFld = (int)((s - (iFld + iFld)) - (--d));
        d *= (-(iFld %= (int)((long)(d) | 1)));
    }
    for (i = 2; i < 79; i++) {
        l += i;
        l /= ((i * ((-Long.reverseBytes(l)) - (i - s))) | 1);
        iFld = ((-(s + s)) - (++iFld));
        iFld += ((iArr[i]++) * (--iFld));
        for (d1 = 3; d1 < 92; d1++) {
            f1 += ((i1 = (int)(s + d)) - ((i - iFld) + (i * l)));
        }
    }
    for (i2 = 3; i2 < 91; i2++) {
        i3 <<= (int)(++l);
        l += (i2 - f1);
    }
    i4 = 1;
    do {
        l = (long)((l = (long)(++dArr[i4 + 1])) + d1);
        i3 = (int)l;
        for (i5 = i4; i5 < 81; i5++) {
            d += 0;
            iFld = (iFld * i5);
            iFld += i5;
            if (b) continue;
            i3 += (i5 * i5);
        }
    } while (++i4 < 84);

    System.out.println("f l s = " + Float.floatToIntBits(f) + "," + l + "," + s);
    System.out.println("d i d1 = " + Double.doubleToLongBits(d) + "," + i + "," + Double.doubleToLongBits(d1));
    System.out.println("f1 i1 i2 = " + Float.floatToIntBits(f1) + "," + i1 + "," + i2);
    System.out.println("i3 i4 i5 = " + i3 + "," + i4 + "," + i5);
    System.out.println("b iArr dArr = " + (b ? 1 : 0) + "," + checkSum(iArr) + "," +
        Double.doubleToLongBits(checkSum(dArr)));

    System.out.println("iFld = " + iFld);
}
}
