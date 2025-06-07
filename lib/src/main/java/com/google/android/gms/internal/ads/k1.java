package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class k1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final c63 f10765a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10766b;

    private k1(int i10, c63 c63Var) {
        this.f10766b = i10;
        this.f10765a = c63Var;
    }

    public static k1 c(int i10, jm2 jm2Var) {
        String strConcat;
        int iQ;
        StringBuilder sb2;
        String str;
        String str2;
        z53 z53Var = new z53();
        int iL = jm2Var.l();
        int i11 = -2;
        while (jm2Var.i() > 8) {
            int iO = jm2Var.o();
            int iK = jm2Var.k() + jm2Var.o();
            jm2Var.e(iK);
            b1 l1Var = null;
            if (iO != 1414744396) {
                switch (iO) {
                    case 1718776947:
                        if (i11 == 2) {
                            jm2Var.g(4);
                            int iO2 = jm2Var.o();
                            int iO3 = jm2Var.o();
                            jm2Var.g(4);
                            iQ = jm2Var.o();
                            switch (iQ) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                i7 i7Var = new i7();
                                i7Var.x(iO2);
                                i7Var.f(iO3);
                                i7Var.s(str2);
                                l1Var = new l1(i7Var.y());
                                break;
                            } else {
                                sb2 = new StringBuilder();
                                str = "Ignoring track with unsupported compression ";
                                sb2.append(str);
                                sb2.append(iQ);
                                strConcat = sb2.toString();
                            }
                        } else if (i11 == 1) {
                            iQ = jm2Var.q();
                            String str3 = iQ != 1 ? iQ != 85 ? iQ != 255 ? iQ != 8192 ? iQ != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                            if (str3 != null) {
                                int iQ2 = jm2Var.q();
                                int iO4 = jm2Var.o();
                                jm2Var.g(6);
                                int iR = sv2.r(jm2Var.w());
                                int iQ3 = jm2Var.q();
                                byte[] bArr = new byte[iQ3];
                                jm2Var.b(bArr, 0, iQ3);
                                i7 i7Var2 = new i7();
                                i7Var2.s(str3);
                                i7Var2.e0(iQ2);
                                i7Var2.t(iO4);
                                if ("audio/raw".equals(str3) && iR != 0) {
                                    i7Var2.n(iR);
                                }
                                if ("audio/mp4a-latm".equals(str3) && iQ3 > 0) {
                                    i7Var2.i(c63.v(bArr));
                                }
                                l1Var = new l1(i7Var2.y());
                                break;
                            } else {
                                sb2 = new StringBuilder();
                                str = "Ignoring track with unsupported format tag ";
                                sb2.append(str);
                                sb2.append(iQ);
                                strConcat = sb2.toString();
                            }
                        } else {
                            strConcat = "Ignoring strf box for unsupported track type: ".concat(sv2.F(i11));
                        }
                        ad2.e("StreamFormatChunk", strConcat);
                        break;
                    case 1751742049:
                        l1Var = h1.b(jm2Var);
                        break;
                    case 1752331379:
                        l1Var = i1.b(jm2Var);
                        break;
                    case 1852994675:
                        l1Var = m1.b(jm2Var);
                        break;
                }
            } else {
                l1Var = c(jm2Var.o(), jm2Var);
            }
            if (l1Var != null) {
                if (l1Var.a() == 1752331379) {
                    int i12 = ((i1) l1Var).f9475a;
                    if (i12 == 1935960438) {
                        i11 = 2;
                    } else if (i12 == 1935963489) {
                        i11 = 1;
                    } else if (i12 != 1937012852) {
                        ad2.e("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                        i11 = -1;
                    } else {
                        i11 = 3;
                    }
                }
                z53Var.g(l1Var);
            }
            jm2Var.f(iK);
            jm2Var.e(iL);
        }
        return new k1(i10, z53Var.j());
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final int a() {
        return this.f10766b;
    }

    public final b1 b(Class cls) {
        c63 c63Var = this.f10765a;
        int size = c63Var.size();
        int i10 = 0;
        while (i10 < size) {
            b1 b1Var = (b1) c63Var.get(i10);
            i10++;
            if (b1Var.getClass() == cls) {
                return b1Var;
            }
        }
        return null;
    }
}
