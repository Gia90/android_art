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

// Generated by Android Runtime Fuzzer tool (3.5.002). Sat Jul  4 08:46:38 2015
// srand = 2762159745907904525717689398008824867182470643008857798763876780620

package OptimizationTests.regression.test2237;

import OptimizationTests.regression.shared.*;

public class Main extends FuzzerUtils {

    public static final int N = 100;

    public static long lFld=40735L;
    public static int iArrFld[]=new int[N];

    static {
        init(iArrFld, 210);
    }

public static void main(String[] strArr1) {

    short s1=3926;
    float f1=78.782F, fArr[]=new float[N];
    boolean b=false, b1=false;
    byte by=-92;
    long l=-62844L;
    int i2=-2705, i3=67, i4=-3, i5=156, i6=-3, i7=-8, i8=61770;
    double d=1.10956;

    init(fArr, -46.681F);

    if (b = ((iArrFld[(i3 >>> 1) % N] >>>= (-(--iArrFld[(i3 >>> 1) % N]))) > ((-(d++)) * (by * l)))) {
        i2 = 1;
        do {
            f1 = ((i3--) >> (long)(iArrFld[i2 + 1] + (fArr[i2 + 1] = -237)));
            b = b1;
            i4 = 1;
            do {
                i3 = (int)(((l - f1) * (232 - (f1 + lFld))) - ((i2 + lFld) + iArrFld[i4]));
                lFld *= i3;
                lFld = (long)(-9 * ((d - lFld) * iArrFld[i4]));
                for (i5 = i4; i5 < i2; i5++) {
                    iArrFld[i5] = (++i3);
                    if (((++lFld) <= i2) != (b = ((i3 <<= i5) > (f1 + i4)))) continue;
                    i3 += (i5 * i5);
                    iArrFld[i5 + 1] = (int)(((i4 * d) * (++l)) + i4);
                    switch (((((i3 + i3) >>> 1) % 4) * 5) + 63) {
                    case 75:
                    case 65:
                        i3 = i4;
                        break;
                    case 68:
                        i3 *= (-iArrFld[i5]);
                        i6 = (int)(l--);
                        i6 = (int)(((i2 + s1) + (i6 + 1637801089L)) + (-(i7++)));
                        l *= ((--i6) + i6);
                        break;
                    case 77:
                        i7 -= (i7 = ((i3 + i2) - (s1 + 57)));
                        i7 = (int)(by - ((d + i5) - (i3 + i7)));
                        iArrFld[i4] *= i4;
                        i3 >>= (int)(((f1 * i6) + (f1++)) + by);
                        break;
                    }
                    f1 *= (((-14L - (lFld * i3)) + i8) * ((i4 - 14) - (-307927629L - (i6 + i3))));
                    i3 = (++i6);
                }
            } while (++i4 < 97);
        } while (++i2 < 86);
    } else if ((-((++s1) * l)) != (f1 = s1)) {
        i7 = (int)Math.sqrt(0.87900);
    } else {
        fArr[(-7 >>> 1) % N] = (l++);
    }

    System.out.println("i2 f1 i3 = " + i2 + "," + Float.floatToIntBits(f1) + "," + i3);
    System.out.println("b b1 i4 = " + (b ? 1 : 0) + "," + (b1 ? 1 : 0) + "," + i4);
    System.out.println("l d i5 = " + l + "," + Double.doubleToLongBits(d) + "," + i5);
    System.out.println("i6 s1 i7 = " + i6 + "," + s1 + "," + i7);
    System.out.println("by i8 fArr = " + by + "," + i8 + "," + Double.doubleToLongBits(checkSum(fArr)));

    System.out.println("lFld iArrFld = " + lFld + "," + checkSum(iArrFld));
}
}
