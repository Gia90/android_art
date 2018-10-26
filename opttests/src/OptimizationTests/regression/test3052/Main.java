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

// Generated by Android Runtime Fuzzer tool (4.1.001). Mon Dec 28 23:51:57 2015
// srand = 44122407553218466329064008554334329885

package OptimizationTests.regression.test3052;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long instanceCount=5362478921559349962L;
    public static double dArrFld[][]=new double[N][N];

    static {
        init(Main.dArrFld, 2.85351);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;

public static int iMeth1(int i6, int i7, int i8) {

    double d=-63.28294;
    float f2=-21.408F, fArr2[]=new float[N];
    byte by1=-6;
    short s=4988;
    int i9=-14, i10=13491, iArr1[]=new int[N];

    init(fArr2, 2.369F);
    init(iArr1, -45);

    for (d = 5; d < 85; d++) {
        byte byArr1[]=new byte[N];
        f2 *= (i8--);
        by1 *= (byte)(i8 += (int)((f2 + by1) - (Main.instanceCount << i7)));
        i7 = (int)(Math.abs(++i7) - (fArr2[(int)(d + 1)]--));
        i7 += (int)(i6 * ((i6 + i6) * (-20L + Main.instanceCount)));
        Main.dArrFld[(int)(d)][(int)(d)] -= (Main.instanceCount + iArr1[(int)(d)]);
        iArr1[(int)(d)] <<= (s - (byArr1[(int)(d)]++));
    }
    i9 = 1;
    while ((i9 += 2) < 96) {
        for (i10 = 1; i10 < 18; ++i10) {
            i8 = i9;
            i7 += i10;
            f2 *= (i7--);
        }
    }
    long meth_res = i6 + i7 + i8 + Double.doubleToLongBits(d) + Float.floatToIntBits(f2) + by1 + s + i9 + i10 +
        Double.doubleToLongBits(checkSum(fArr2)) + checkSum(iArr1);
    iMeth1_check_sum += meth_res;
    return (int)meth_res;
}

public static int iMeth() {

    int i3=112, i4=-14, i5=5, iArr[]=new int[N];
    float f1=93.223F, fArr1[]=new float[N];
    double dArr1[]=new double[N];

    init(iArr, 0);
    init(fArr1, -1.213F);
    init(dArr1, -59.77590);

    i3 = 1;
    do {
        f1 = (Main.instanceCount--);
        for (i4 = i3; i4 < 53; i4++) {
            try {
                i5 = (-1251249344 % i3);
                i5 = (i4 % 2044342179);
                i5 = (-160 % iArr[i3 - 1]);
            } catch (ArithmeticException a_e) {}
            if (i3 != 0) {
            }
            i5 = iArr[i3];
            f1 += (--fArr1[i3]);
            i5 <<= i5;
        }
        iArr[i3 + 1] -= (int)((i5 - Main.instanceCount) - ((--i5) - (-(i5 % -44090))));
        i5 += (int)Math.abs(f1++);
        dArr1[i3] -= ((long)((i4 - f1) - i3) >> iMeth1(i5, i4 - i4, i3 - i3));
        i5 *= (int)Main.instanceCount;
    } while (++i3 < 87);
    long meth_res = i3 + Float.floatToIntBits(f1) + i4 + i5 + checkSum(iArr) + Double.doubleToLongBits(checkSum(fArr1))
        + Double.doubleToLongBits(checkSum(dArr1));
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static void main(String[] strArr) {

    int i=4, i1=39, i2=-129, i11=-76, i12=2, i13=63877, iArr2[]=new int[N];
    byte by=57, byArr[]=new byte[N];
    float f=0.752F, fArr[]=new float[N];
    long l=-6454367280729377542L, lArr[]=new long[N];
    short s1=-1994, sArr[][]=new short[N][N];
    double dArr[]=new double[N];

    init(byArr, (byte)67);
    init(fArr, -1.615F);
    init(lArr, -6L);
    init(dArr, -1.78169);
    init(sArr, (short)12034);
    init(iArr2, 218);

    for (i = 6; i < 97; i++) {
        by += (byte)(Main.instanceCount--);
        i1 -= (int)((-30918 + (++Main.instanceCount)) + i1);
        i1 = (((i - -34600) - byArr[i]) + -12);
        f -= (l--);
        fArr[i - 1] = (--Main.instanceCount);
        i1 += (i * i);
        i1 ^= (int)(--Main.instanceCount);
    }
    for (i2 = 3; i2 < 79; i2++) {
        lArr[i2 - 1] -= (((i1++) - (i1 += i)) + i);
        i1 = (int)(-dArr[i2]);
        l <<= iMeth();
        i11 = 1;
        do {
            l >>= i;
            i12 = 1;
            do {
                i1 <<= i1;
                sArr[i2 + 1][i12] *= (short)(i1--);
                i1 = i;
                s1 = (short)(i12 / ((by++) | 1));
            } while (++i12 < i11);
            i1 -= (int)((--i1) + ((long)(i1 * -1.75940) | (byArr[i2 - 1]--)));
            iArr2[i2 + 1] = (--iArr2[i2 - 1]);
        } while (++i11 < 60);
        i1 = ((++by) + i2);
        for (i13 = 92; i13 > 4; --i13) {
            i1 = (int)((l--) - (202 - (i12 + -52212)));
            i1 = (++i1);
        }
    }

    System.out.println("i by i1 = " + i + "," + by + "," + i1);
    System.out.println("f l i2 = " + Float.floatToIntBits(f) + "," + l + "," + i2);
    System.out.println("i11 i12 s1 = " + i11 + "," + i12 + "," + s1);
    System.out.println("i13 byArr fArr = " + i13 + "," + checkSum(byArr) + "," +
        Double.doubleToLongBits(checkSum(fArr)));
    System.out.println("lArr dArr sArr = " + checkSum(lArr) + "," + Double.doubleToLongBits(checkSum(dArr)) + "," +
        checkSum(sArr));
    System.out.println("iArr2 = " + checkSum(iArr2));

    System.out.println("Main.instanceCount Main.dArrFld = " + Main.instanceCount + "," +
        Double.doubleToLongBits(checkSum(Main.dArrFld)));

    System.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
}
}
