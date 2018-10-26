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

// Generated by Dalvik Fuzzer tool (3.5.001). Sun Jan 18 20:22:28 2015
package OptimizationTests.regression.test17623;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


    public static long iMeth_check_sum = 0;

public static int iMeth(int i3) {

    int i4=-165, i5=55, i6=10;
    float f1=0.10F;
    double dArr1[]=new double[N];
    byte by1=-59;
    long l1=17651L;

    init(dArr1, -79.58510);

    for (i4 = 1; i4 < 87; ++i4) {
        l1 = (i3--);
        by1 %= (byte)((long)(((i4 * i4) * -12) / ((long)(-(f1--)) | 1)) | 1);
        i5 = 1;
        while (++i5 < 75) {
            i3 = ((++i3) | i4);
        }
    }
    for (i6 = 5; i6 < 89; i6++) {
        i3 = (--i3);
        dArr1[i6 + 1] = i3;
        i3 *= i3;
        i3 |= (int)((i3++) + 232L);
        i3 += ((-(i3 + i6)) * i5);
    }
    i3 *= (int)(++l1);
    long meth_res = i3 + i4 + l1 + by1 + Float.floatToIntBits(f1) + i5 + i6 + Double.doubleToLongBits(checkSum(dArr1));
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] strArr) {

    int i=43463, i1=-64, i2=2639, i7=-154, i8=-35032, i9=59947, iArr[]=new int[N];
    short s=-6135;
    float f=69.862F, fArr[]=new float[N];
    double d=-33.33479, dArr[]=new double[N];
    byte by=34, byArr[]=new byte[N];
    long l=-9L, lArr[][]=new long[N][N];

    init(lArr, -4135232150L);
    init(iArr, 33);
    init(fArr, 2.866F);
    init(dArr, -125.80601);
    init(byArr, (byte)92);

    i = 83;
    while ((i -= 3) > 0) {
        for (i1 = 1; i1 < 29; i1++) {
            i2 -= (int)(Math.abs(++f) - (lArr[i1 - 1][i + 1]++));
            iArr[i1] |= (int)Math.max((long)((f--) - 29216L), l);
            l = (i2--);
            fArr[(-1899 >>> 1) % N] = l;
            i2 *= (int)(l - f);
            by >>= (byte)((f * (++dArr[i1])) - i);
        }
        i2 &= iMeth((int)((++f) + i1));
        i2 += (--i2);
        try {
            i2 = (i % -236);
            i2 = (i1 / -2029873935);
            i2 = (-87 % iArr[i + 1]);
        } catch (ArithmeticException a_e) {}
        i2 += (((i * i1) + l) - f);
        for (i7 = 2; i7 < 54; ++i7) {
            i2 -= (int)Math.abs(Double.longBitsToDouble(-8970286694288594799L));
            i2 += (int)(((i2--) + (++f)) - (i7 + (i1 * i)));
            i8 = (int)(((l - i) * l) + (--d));
            i2 &= (int)(((--f) - (s + l)) + (--d));
            i9 %= ((((i * i8) + (93 + (++i8))) - i9) | 1);
            i8 += (8 + (i7 * i7));
            try {
                s += (short)(-2914594320L + (i7 * i7));
                i9 = (iArr[i7 - 1] = (i2++));
                iArr[i7 + 1] = byArr[i];
                s >>= (short)l;
                dArr[i] -= (i2++);
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                i8 |= (int)(((i8++) * (++l)) + (--i8));
            }
        }
    }

    System.out.println("i i1 i2 = " + i + "," + i1 + "," + i2);
    System.out.println("f l by = " + Float.floatToIntBits(f) + "," + l + "," + by);
    System.out.println("i7 i8 d = " + i7 + "," + i8 + "," + Double.doubleToLongBits(d));
    System.out.println("s i9 lArr = " + s + "," + i9 + "," + checkSum(lArr));
    System.out.println("iArr fArr dArr = " + checkSum(iArr) + "," + Double.doubleToLongBits(checkSum(fArr)) + "," +
        Double.doubleToLongBits(checkSum(dArr)));
    System.out.println("byArr = " + checkSum(byArr));


    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
}
}
