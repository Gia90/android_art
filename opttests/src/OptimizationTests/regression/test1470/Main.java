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

// Generated by Dalvik Fuzzer tool (3.5.001). Sun Feb  8 01:34:37 2015
package OptimizationTests.regression.test1470;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


public static void main(String[] strArr) {

    short s=16321;
    boolean b=true;
    double d=-82.100578;
    long l=-3462946950238890006L, l1=4265462743L, lArr[]=new long[N];
    float f=0.57F, f1=-45.768F;
    int i=-245, i1=11, i2=12, i3=57484, i4=-79, i5=-9440, iArr[][]=new int[N][N];

    init(lArr, 65079L);
    init(iArr, 11);

    for (i = 3; i < 92; ++i) {
        i1 *= (i1++);
        l = i1;
        lArr[i + 1] |= i1;
        i1 &= (int)((lArr[i] = i1) - 1012051678L);
        l *= (long)(((d * f) + (d + l)) - (lArr[i + 1] -= i));
        for (i2 = 1; i2 < i; ++i2) {
            i1 += (int)(0.441F + (i2 * i2));
            l += (((i1 >>= i1) * (-9L + (l + l))) * -47743);
            i3 <<= (int)((i3 += (int)(i3 - d)) - d);
            for (i4 = 70; i4 > 1; i4--) {
                l1 = (i1 += ((i3--) - (i4 + i1)));
                b = (((f1 - f1) + (++i1)) > s);
                l1 += ((i1--) >> i1);
                i1 += (((i4 * l) + i3) - i3);
                try {
                    i3 = (i % i);
                    iArr[i2 + 1][i2 - 1] = (50878 / i4);
                    i1 = (i % 234);
                } catch (ArithmeticException a_e) {}
                i1 += (i4 * i4);
                i3 += i4;
            }
            iArr[i][i] = s;
            l |= lArr[i];
            for (i5 = 2; i5 < 51; i5++) {
                i1 *= i5;
                d -= Math.min(i3, (int)((f - l) - (i2 + l1)));
                i3 += (int)((++i3) - ((l1 + l) - (i4 + i3)));
                l1 = (iArr[i5][i2]++);
            }
        }
    }

    System.out.println("i i1 l = " + i + "," + i1 + "," + l);
    System.out.println("d f i2 = " + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f) + "," + i2);
    System.out.println("i3 i4 l1 = " + i3 + "," + i4 + "," + l1);
    System.out.println("b f1 s = " + (b ? 1 : 0) + "," + Float.floatToIntBits(f1) + "," + s);
    System.out.println("i5 lArr iArr = " + i5 + "," + checkSum(lArr) + "," + checkSum(iArr));

}
}
