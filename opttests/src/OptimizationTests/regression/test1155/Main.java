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

// Generated by Dalvik Fuzzer tool (3.5.001). Wed Jan 14 00:46:52 2015
package OptimizationTests.regression.test1155;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static short sArrFld[]=new short[N];

    static {
        init(sArrFld, (short)966);
    }

    public static long iMeth_check_sum = 0;
    public static long lMeth_check_sum = 0;

public static int iMeth() {

    byte by1=95;
    long l=-47382L;
    float f=65.743F, f1=0.274F, fArr[]=new float[N];
    double d1=2.51572;
    short sArr[]=new short[N];
    int i2=118, i3=42968, i4=8, i5=47725, i6=-8784, i7=-4, iArr1[]=new int[N];

    init(iArr1, -14314);
    init(fArr, -6.590F);
    init(sArr, (short)19596);

    for (i2 = 4; i2 < 93; ++i2) {
        f = Math.min(i2 * (i2 + i3), --i3);
        i4 >>= (int)((long)(d1 * (i2 + l)) << Integer.reverseBytes(i3));
        i5 += i2;
        i6 = 1;
        do {
            l = (i6 % ((i3 = (i2 + i4)) | 1));
            by1 = (byte)((++i3) - -62.87215);
            iArr1[i2] = i2;
            fArr[i2 + 1] += (i3 - iArr1[i2 - 1]);
        } while (++i6 < 76);
        i7 = 1;
        do {
            i5 >>>= (int)(i5 >>= (int)((i6 * -33262L) + (-(f1++))));
            i3 = sArr[i7 - 1];
        } while (++i7 < 78);
    }
    long meth_res = i2 + Float.floatToIntBits(f) + i3 + i4 + Double.doubleToLongBits(d1) + l + i5 + i6 + by1 + i7 +
        Float.floatToIntBits(f1) + checkSum(iArr1) + Double.doubleToLongBits(checkSum(fArr)) + checkSum(sArr);
    iMeth_check_sum += meth_res;
    return (int)meth_res;
}

public static long lMeth(int i9, float f3) {

    byte by2=-103;
    long l2=6794978771039458790L, lArr[][]=new long[N][N];
    double d2=-111.42271, d3=86.29977;
    int i10=-73, i11=-9, i12=-2, iArr2[]=new int[N];

    init(iArr2, 166);
    init(lArr, 7L);

    for (i10 = 2; i10 < 90; i10 += 3) {
        f3 += i10;
        i9 >>= iArr2[i10 - 1];
    }
    switch ((((iArr2[(i10 >>> 1) % N] >>> 1) % 2) * 5) + 54) {
    case 57:
        for (i11 = 6; i11 < 97; i11++) {
            f3 += -2;
            i9 -= (-i10);
        }
        for (i12 = 1; i12 < 82; i12++) {
            d2 = 28;
            while ((d2 -= 3) > 0) {
                f3 -= i12;
                i9 += (int)(((l2 *= (long)d2) + by2) + (i9++));
            }
            lArr[i12 - 1][i12 + 1] = (--i9);
        }
        break;
    case 61:
        lArr[(i10 >>> 1) % N][(i9 >>> 1) % N] &= (long)(d3 - Float.floatToRawIntBits(i10 + i12));
        break;
    }
    long meth_res = i9 + Float.floatToIntBits(f3) + i10 + i11 + i12 + Double.doubleToLongBits(d2) + l2 + by2 +
        Double.doubleToLongBits(d3) + checkSum(iArr2) + checkSum(lArr);
    lMeth_check_sum += meth_res;
    return (long)meth_res;
}

public static void main(String[] strArr) {

    float f2=-75.549F, fArr1[]=new float[N];
    long l1=-7543993554175833895L, lArr1[]=new long[N];
    byte by=-31;
    boolean b=false, bArr[]=new boolean[N];
    double d=2.6375, dArr[]=new double[N];
    short s=-26418;
    int i=0, i1=-50706, i8=-9, i13=-11, i14=13243, i15=-225, i16=-7, iArr[]=new int[N];

    init(iArr, 6);
    init(dArr, 0.86796);
    init(bArr, true);
    init(lArr1, 14L);
    init(fArr1, 42.277F);

    i = 1;
    do {
        i1 -= (int)(((by - 188) << (iArr[i + 1]--)) + d);
        i1 -= (int)((iMeth() - (-4L / ((l1 >> s) | 1))) + (--i1));
        i1 += (int)((d++) + -230);
        i1 += (i + s);
        if (b = (false == ((s - i1) != (--l1)))) break;
        i1 -= (int)f2;
        dArr[i] *= -5;
        l1 *= ((l1 - (l1 / (i | 1))) - i1);
    } while (++i < 81);
    for (i8 = 2; i8 < 93; ++i8) {
        i1 = (int)(0.26F + ((i8 + i) - 1.639F));
        l1 += lMeth((int)((++l1) - sArrFld[i8 - 1]), f2++);
        for (i13 = 1; i13 < 47; ++i13) {
            if (bArr[i8 - 1] = (b = ((lArr1[i8 + 1]--) != (iArr[i8 + 1]++)))) break;
        }
        i14 = (int)(((i1 + i) + by) + lMeth(i, fArr1[i8 + 1] += l1));
        if (b) break;
        i14 += (int)(++lArr1[i8]);
        for (i15 = 1; i15 < 52; ++i15) {
            i16 = 1;
            while (++i16 < 15) {
                i1 += (int)(l1 - f2);
                l1 -= (i14++);
            }
            i14 = (int)(i16 * (-(i8 - l1)));
            f2 = i13;
            f2 += (--l1);
        }
        l1 += (i8 * i8);
    }

    System.out.println("i i1 by = " + i + "," + i1 + "," + by);
    System.out.println("d l1 s = " + Double.doubleToLongBits(d) + "," + l1 + "," + s);
    System.out.println("b f2 i8 = " + (b ? 1 : 0) + "," + Float.floatToIntBits(f2) + "," + i8);
    System.out.println("i13 i14 i15 = " + i13 + "," + i14 + "," + i15);
    System.out.println("i16 iArr dArr = " + i16 + "," + checkSum(iArr) + "," + Double.doubleToLongBits(checkSum(dArr)));
    System.out.println("bArr lArr1 fArr1 = " + checkSum(bArr) + "," + checkSum(lArr1) + "," +
        Double.doubleToLongBits(checkSum(fArr1)));

    System.out.println("sArrFld = " + checkSum(sArrFld));

    System.out.println("iMeth_check_sum: " + iMeth_check_sum);
    System.out.println("lMeth_check_sum: " + lMeth_check_sum);
}
}
