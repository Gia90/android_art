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

// Generated by Android Runtime Fuzzer tool (3.5.002). Tue Jun 23 14:28:01 2015
// srand = 23419754956793541119580881322434892836219177197093486544870573674238

package OptimizationTests.regression.test2189;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;


    public static long vMeth_check_sum = 0;

public static void vMeth(short s, int i8) {

    float fArr[][]=new float[N][N];
    long l4=4667466762213792166L, lArr[]=new long[N];
    int i9=8, i10=-103;
    byte by2=-23;
    double dArr1[]=new double[N];

    init(lArr, -59L);
    init(fArr, -1.655F);
    init(dArr1, -51.10045);

    for (i9 = 2; i9 < 81; ++i9) {
        l4 ^= l4;
        l4 += (i9 * i9);
    }
    for (i10 = 5; i10 < 85; i10++) {
        i8 = (--i8);
        i8 += (i10 + i10);
    }
    for (long l5 : lArr) {
        fArr[(-27419 >>> 1) % N][(i10 >>> 1) % N] = (((i8++) - i10) - i8);
        fArr[(i8 >>> 1) % N][(35008 >>> 1) % N] = (float)(dArr1[(i9 >>> 1) % N] - (fArr[(i8 >>> 1) % N][(i9 >>> 1) % N]
            = lArr[(i10 >>> 1) % N]));
        i8 -= (int)(((i8 - i8) / ((by2 - -576508809L) | 1)) + ((54 - (-9 - (++i8))) + (i8 / -2.48770)));
    }
    i8 = (int)l4;
    by2 = (byte)i8;
    vMeth_check_sum += s + i8 + i9 + l4 + i10 + by2 + checkSum(lArr) + Double.doubleToLongBits(checkSum(fArr)) +
        Double.doubleToLongBits(checkSum(dArr1));
}

public static void main(String[] strArr1) {

    short s1=24950;
    float f1=2.38F, f2=-93.863F, fArr1[][]=new float[N][N];
    long l2=-2471500366L, l3=-203L, l6=3576882145L, lArr1[]=new long[N];
    int i4=-37884, i5=-28633, i6=13, i7=10, i11=-2, i12=67, iArr1[]=new int[N];
    byte by1=-34, byArr[]=new byte[N];
    boolean b=true, bArr[][]=new boolean[N][N];
    double d1=-1.104800;

    init(iArr1, 10553);
    init(byArr, (byte)47);
    init(fArr1, 6.109F);
    init(lArr1, 14L);
    init(bArr, true);

    for (i4 = 2; i4 < 92; ++i4) {
        i5 = (int)(((--l2) - (i4 - 13L)) * ((l3++) + (i4 + i5)));
    }
    for (i6 = 4; i6 < 78; i6++) {
        i5 = (int)(l3 - f1);
        i5 = i4;
        i5 += (i5--);
        i5 = (int)((-Double.longBitsToDouble(1812662224L)) + ((i6 + -8) - (--iArr1[i6 + 1])));
        by1 -= (byte)d1;
    }
    i7 = 1;
    do {
        if (b ^ (((by1 + f1) - iArr1[i7]) >= 6924)) {
            vMeth((short)(((f2--) - (-(-(s1 = (short)i6)))) * ((--i5) * (i4 - i5))), (int)((i5 ^= (i4 * i6)) * l2));
            by1 += (byte)((Integer.reverseBytes(-40869) * (--l2)) - ((i5++) + (iArr1[i7 + 1] = (int)l6)));
            byArr[i7 - 1] = (byte)((fArr1[i7 + 1][i7 + 1] += i4) + -2.239F);
        } else if (b = (b || ((++iArr1[(i7 >>> 1) % N]) >= (f2--)))) {
            i5 = (int)d1;
            for (i11 = 4; i11 < 71; i11++) {
                fArr1[i11 + 1][i7 + 1] = i4;
                i5 -= (int)lArr1[i11];
            }
            s1 *= (short)l3;
            for (i12 = i7; i12 < i7; i12++) {
                iArr1[i7 - 1] = (int)(((s1 - l6) * (l2 - l2)) - 252);
                l2 -= i12;
                i5 = (int)(((i7 + by1) * (l6 - by1)) * (-i6));
                l3 += i12;
            }
        } else if (bArr[i7 + 1][i7 + 1]) {
            try {
                i5 = (iArr1[i7] % i4);
                i5 = (13 % i6);
                i5 = (-58134 % i6);
            } catch (ArithmeticException a_e) {}
            by1 = (byte)((i5++) + ((i12 * 5) - (f1--)));
        }
    } while (++i7 < 82);

    System.out.println("i4 i5 l2 = " + i4 + "," + i5 + "," + l2);
    System.out.println("l3 i6 f1 = " + l3 + "," + i6 + "," + Float.floatToIntBits(f1));
    System.out.println("by1 d1 i7 = " + by1 + "," + Double.doubleToLongBits(d1) + "," + i7);
    System.out.println("f2 s1 l6 = " + Float.floatToIntBits(f2) + "," + s1 + "," + l6);
    System.out.println("i11 i12 b = " + i11 + "," + i12 + "," + (b ? 1 : 0));
    System.out.println("iArr1 byArr fArr1 = " + checkSum(iArr1) + "," + checkSum(byArr) + "," +
        Double.doubleToLongBits(checkSum(fArr1)));
    System.out.println("lArr1 bArr = " + checkSum(lArr1) + "," + checkSum(bArr));


    System.out.println("vMeth_check_sum: " + vMeth_check_sum);
}
}
