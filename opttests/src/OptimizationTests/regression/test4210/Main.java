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

// Generated by Android Runtime Fuzzer tool (3.5.002). Sat Sep 26 18:18:47 2015
// srand = 333933280288371806955793206481452870569

package OptimizationTests.regression.test4210;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static byte byFld=-6;
    public static int iFld=-12027;

public static void main(String[] strArr) {

    int i=78, i1=-14, i2=-8, i3=10, i4=-14, i5=34, iArr[]=new int[N];
    long l=-4574487991543084915L, lArr[]=new long[N];
    double d=0.43632, d1=2.94242;
    float f=105.851F, fArr[]=new float[N];
    boolean b=false;

    init(iArr, 24048);
    init(fArr, -109.645F);
    init(lArr, 223L);

    for (i = 2; i < 83; i++) {
        i1 = (((i1--) - (i1 = byFld)) % -10);
        if (89L != (Math.sqrt(l * l) + (i + (d % (i | 1))))) {
            l = (++i1);
        } else {
            iArr[i + 1] = iArr[i];
        }
        d += (fArr[i]++);
        i1 = (--i1);
        i1 = (int)f;
        f -= ((i1++) + ((--i1) + (++l)));
        i1 *= (int)(-(i - (l * i2)));
        i2 += i;
        b = b;
        for (i3 = 1; i3 < i; ++i3) {
            i1 -= ((-i2) + (i2 = (iFld = i1)));
            iFld += (i3 + i1);
            iArr[i + 1] -= (int)(((l = byFld) * f) * ((--iArr[i3]) + (l << l)));
        }
    }
    i4 = 1;
    while (++i4 < 97) {
        iFld += i1;
        iFld >>>= (int)(l + -10L);
        for (d1 = 1; d1 < 98; d1++) {
            lArr[i4 + 1] = (long)((i5 - (-d1)) - (-(i1 * -12)));
            i2 -= iArr[(int)(d1 - 1)];
            if (i <= (((iFld++) - i4) + (--i5))) break;
            d = (++iFld);
        }
        i5 -= (--i5);
    }

    System.out.println("i i1 l = " + i + "," + i1 + "," + l);
    System.out.println("d f i2 = " + Double.doubleToLongBits(d) + "," + Float.floatToIntBits(f) + "," + i2);
    System.out.println("b i3 i4 = " + (b ? 1 : 0) + "," + i3 + "," + i4);
    System.out.println("d1 i5 iArr = " + Double.doubleToLongBits(d1) + "," + i5 + "," + checkSum(iArr));
    System.out.println("fArr lArr = " + Double.doubleToLongBits(checkSum(fArr)) + "," + checkSum(lArr));

    System.out.println("byFld iFld = " + byFld + "," + iFld);
}
}
