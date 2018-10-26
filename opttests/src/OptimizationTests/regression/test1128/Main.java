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

// Generated by Dalvik Fuzzer tool (3.5.001). Sat Jan 10 00:03:49 2015
package OptimizationTests.regression.test1128;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static float fArrFld[]=new float[N];

    static {
        init(fArrFld, 87.939F);
    }

    public static long vMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

public static void vMeth(int i1) {

    int i2=-11, iArr[]=new int[N];
    float f=-2.519F, f1=-1.297F;
    byte by1=-3;
    double d=43.29438, dArr[]=new double[N];
    boolean b=false;
    short s=13772, sArr[]=new short[N];
    long l=-5500133966722104974L, lArr1[]=new long[N];

    init(iArr, 21425);
    init(sArr, (short)30458);
    init(dArr, 14.125249);
    init(lArr1, -302961687395555924L);

    for (f = 5; f < 82; ++f) {
        i1 <<= -169;
        b = (((i1 * l) != (iArr[(int)(f)]++)) == (b = (l != i1)));
        for (i2 = 2; i2 < 77; i2++) {
            i1 = (int)(((12 + (i1 + i1)) + (by1 - 102.864F)) - d);
            l = (long)(((0.106411 * i1) - (i1 = (int)f)) - (s - (l + i1)));
            l = (long)(((l - f) - -63872L) - ((i1 - i1) - (i1 - i2)));
            i1 += (int)((long)((f1--) % ((long)(-94.309F * i1) | 1)) ^ (++sArr[i2 + 1]));
            f1 %= (float)((long)(dArr[i2]++) | 1);
            i1 = (int)(((l++) * (l - i2)) + lArr1[i2 + 1]);
            l += (i2 * i2);
            dArr[i2 + 1] *= (++f1);
        }
    }
    vMeth_check_sum += i1 + Float.floatToIntBits(f) + (b ? 1 : 0) + l + i2 + by1 + Double.doubleToLongBits(d) + s +
        Float.floatToIntBits(f1) + checkSum(iArr) + checkSum(sArr) + Double.doubleToLongBits(checkSum(dArr)) +
        checkSum(lArr1);
}

public static long lMeth(int i3) {

    float f2=0.810F, f3=125.829F;
    int i4=-62428, i5=-204, i6=-57422, iArr2[]=new int[N];
    byte by2=41;
    double d1=0.87669;
    boolean b1=false;
    short s2=312;
    long l2=-2001734272L;

    init(iArr2, -29207);

    for (i4 = 4; i4 < 97; i4++) {
        i3 = (int)(((197 * (f2 - l2)) - (--i3)) - 4);
        s2 *= (short)(fArrFld[i4] - (l2 * (i3--)));
        iArr2[i4 - 1] <<= i3;
        i3 += (((i4 * i3) + i5) - l2);
        for (i6 = 6; i6 < 97; i6 += 3) {
            for (f3 = 1; f3 < i6; ++f3) {
                l2 *= (long)fArrFld[(int)(f3 + 1)];
                i5 *= (int)((i5 = (int)l2) + (--i5));
            }
            i5 >>>= (-(++s2));
            i3 = (-by2);
            b1 = ((b1 || (d1 == i4)) && b1);
        }
    }
    long meth_res = i3 + i4 + Float.floatToIntBits(f2) + l2 + s2 + i5 + i6 + Float.floatToIntBits(f3) + by2 + (b1 ? 1 :
        0) + Double.doubleToLongBits(d1) + checkSum(iArr2);
    lMeth_check_sum += meth_res;
    return (long)meth_res;
}

public static void main(String[] strArr) {

    float f4=17.653F;
    int i=8, i7=-64902, i8=50, i9=-72, i10=-20278, i11=-13, i12=-14618, iArr1[]=new int[N];
    byte by=-77;
    boolean b2=false;
    double d2=0.69047;
    short s1=14067;
    long l1=-6777718353243735223L, lArr[]=new long[N];

    init(lArr, -1934370205775149581L);
    init(iArr1, -6);

    for (i = 5; i < 97; i++) {
        lArr[i] = by;
        vMeth(((s1 - i) - (-27362 >> (iArr1[i] = -14))) - iArr1[i]);
        l1 += lMeth(i);
        iArr1[(i >>> 1) % N] = (int)l1;
        for (i7 = i; i7 < 52; i7++) {
            d2 *= (i8--);
            s1 += (short)i7;
            for (i9 = 1; i9 < 9; ++i9) {
                l1 = l1;
                i8 = (i7 % ((i8++) | 1));
                i8 = (i8++);
                i8 += (int)(-31.167F - (-i9));
                d2 *= f4;
                b2 = b2;
                i8 += (int)(-(l1++));
            }
            i8 = (int)(~(i8 >>= (int)(-24188L - (44546 + (d2 * l1)))));
            i8 *= (iArr1[i7 - 1] + i9);
            for (i10 = 1; i10 < i; ++i10) {
                i8 = Math.min(i7, (int)((i8 -= (int)d2) - iArr1[i7 + 1]));
                i8 = Math.max(i11, i10);
                i8 &= (++i8);
            }
        }
        for (i12 = 1; i12 < 12; ++i12) {
            iArr1[i12 - 1] = (--i8);
            l1 %= (iArr1[i] | 1);
        }
    }

    System.out.println("i by s1 = " + i + "," + by + "," + s1);
    System.out.println("l1 i7 d2 = " + l1 + "," + i7 + "," + Double.doubleToLongBits(d2));
    System.out.println("i8 i9 f4 = " + i8 + "," + i9 + "," + Float.floatToIntBits(f4));
    System.out.println("b2 i10 i11 = " + (b2 ? 1 : 0) + "," + i10 + "," + i11);
    System.out.println("i12 lArr iArr1 = " + i12 + "," + checkSum(lArr) + "," + checkSum(iArr1));

    System.out.println("fArrFld = " + Double.doubleToLongBits(checkSum(fArrFld)));

    System.out.println("vMeth_check_sum: " + vMeth_check_sum);
    System.out.println("lMeth_check_sum: " + lMeth_check_sum);
}
}
