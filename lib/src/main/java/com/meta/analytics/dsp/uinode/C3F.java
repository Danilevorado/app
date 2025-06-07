package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto;
import com.facebook.ads.internal.exoplayer2.thirdparty.video.DummySurface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3F, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C3F extends AbstractC03846j {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static String[] A0e = {"1acRM6Cf6EhxOJODmj0H0eP8VC35ZmTt", "cV9GjlkLQwwiHa", "i1c6IC1hwgIn8DthxqNi0XpoGO8BN4qE", "gFn4mUSFpSKHUauCdH5nTsZh8y8bn5UZ", "9nkQNk0PAkkX03QPU4alH8fTsKo9h28D", "s2uNxYIY6duU338ylAtcR72UhbPyFCsP", "VOm8bC2ft6X0ZlQ", "HWs0n0OHt4vGmZ"};
    public static final int[] A0f;
    public IQ A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public IP A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final IT A0W;
    public final C0657Ic A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static Point A02(DG dg, Format format) throws DP {
        boolean z10 = format.A08 > format.A0F;
        int i10 = z10 ? format.A08 : format.A0F;
        int i11 = z10 ? format.A0F : format.A08;
        float f5 = i11 / i10;
        for (int i12 : A0f) {
            int i13 = (int) (i12 * f5);
            if (i12 <= i10 || i13 <= i11) {
                return null;
            }
            if (IF.A02 >= 21) {
                int i14 = z10 ? i13 : i12;
                if (!z10) {
                    i12 = i13;
                }
                Point pointA0E = dg.A0E(i14, i12);
                if (dg.A0H(pointA0E.x, pointA0E.y, format.A01)) {
                    return pointA0E;
                }
            } else {
                int iA04 = IF.A04(i12, 16) * 16;
                int iA042 = IF.A04(i13, 16) * 16;
                if (iA04 * iA042 <= DR.A00()) {
                    int i15 = z10 ? iA042 : iA04;
                    if (!z10) {
                        iA04 = iA042;
                    }
                    return new Point(i15, iA04);
                }
            }
        }
        return null;
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0d, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0D() {
        A0d = new byte[]{10, 13, 11, 10, 93, 91, 93, 95, 112, 118, 112, 117, 6, 118, 119, 106, 112, 119, 1, 108, 28, 27, 29, 28, 126, 13, 15, 14, 9, 94, 11, 15, 76, 58, 61, 61, 61, 32, 108, 49, 71, 64, 64, 64, 0, 28, 5, 3, 64, 54, 49, 48, 49, 96, 53, 57, 64, 54, 49, 51, 49, 96, 53, 57, 81, 86, 68, 81, 82, 85, 71, 93, 88, 95, 77, 74, 74, 102, 106, 113, 100, 101, 24, 40, 44, 56, 9, 54, 46, 60, 43, 20, 80, 100, 99, 112, 78, 95, 126, 101, 116, 78, 35, 9, 7, 10, 8, 0, 102, 122, 19, 35, 51, 32, 55, 40, 32, 65, 85, 42, 65, 83, 81, 80, 84, 61, 45, 62, 41, 54, 62, 32, 62, 43, 41, 77, 51, 65, 55, 36, 76, 66, 67, 66, 43, 61, 68, 70, 103, 116, 108, 21, 18, 20, 29, 85, 70, 79, 46, 37, 73, 95, 38, 38, 81, 125, 118, 119, 113, 50, Byte.MAX_VALUE, 115, 106, 50, 96, 119, 97, 125, 126, 103, 102, 123, 125, 124, 50, 115, 118, 120, 103, 97, 102, 119, 118, 50, 102, 125, 40, 50, 104, 68, 70, 66, 68, 120, 26, 15, Byte.MAX_VALUE, 124, 126, 121, 122, 115, 106, 120, 126, 96, 126, 12, 96, 111, 77, 80, 124, 117, 108, 126, 120, 102, 119, 86, 77, 92, 43, 34, 59, 41, 47, 49, 62, 28, 7, 3, 44, 37, 60, 46, 40, 54, 59, 8, 16, 54, 49, 67, 112, 99, 116, 85, 114, 103, 116, 89, 85, 30, 107, 105, 105, 105, 43, 94, 92, 92, 94, 11, 126, 124, 124, 123, Byte.MAX_VALUE, 10, 11, 8, 8, 64, 53, 52, 55, 53, 90, 47, 46, 45, 41, 30, 107, 107, 105, 105, 25, 62, 51, 44, 58, 28, 55, 58, 60, 52, Byte.MAX_VALUE, 4, 51, 58, 56, 62, 60, 38, 25, 45, 62, 50, 58, 12, 54, 37, 58, 115, Byte.MAX_VALUE, 40, 38, 32, 33, 42, 42, 48, 40, 45, 35, 88, 92, 89, 95, 42, 36, 34, 35, 40, 40, 50, 62, 58, 58, 92, 91, 93, 84, 33, 47, 41, 40, 35, 35, 57, 53, 49, 49, 87, 80, 84, 81, 22, 24, 30, 31, 20, 20, 14, 2, 6, 6, 96, 103, 98, 96, 84, 90, 92, 93, 86, 86, 76, 68, 81, 95, 38, 36, 35, 43, Byte.MAX_VALUE, 113, 119, 118, 125, 125, 103, 111, 122, 116, 15, 11, 14, 13, 58, 52, 50, 51, 56, 56, 34, 42, 63, 49, 74, 72, 76, 68, 12, 34, 4, 5, 14, 14, 20, 8, 9, 7, 124, 126, 122, 120, 75, 101, 67, 66, 73, 73, 83, 75, 78, 64, 59, 63, 61, 53, 44, 51, 38, 40, 42, 73, 44, 97, 126, 106, 104, 100, 4, 97, 9, 22, 23, 15, 18, 108, 9, 119, 80, 88, 87, 80, 87, 70, 19, 102, 11, 9, 12, 0, 13, 16, 72, 54, 51, 98, 55, 51, 22, 27, 14, 18, 10, 20, 4, 27, 101, 125, 120, 121, Byte.MAX_VALUE, 8, 112, 38, 62, 54, 58, 41, 38, 44, 62, 70, 76, 89, 55, 53, 29, 28, 17, 25, 59, 23, 28, 29, 27, 46, 17, 28, 29, 23, 42, 29, 22, 28, 29, 10, 29, 10, 114, 106, 117, 120, 117, 125, 30, 8, 101, 100, 97, 26, 115, 101, 8, 10, 14, 119, 40, 42, 63, 73, 0, 8, 8, 0, 11, 2, 44, 13, 6, 51, 15, 22, 16, 86, 55, 41, 79, 65, 72, 96, 8, 5, 50, 32, 80, 79, 84, 85, 82, 47, 35, 52, 61, 70, 65, 75, 42, 61, 52, 76, 75, 74, 55, 32, 41, 81, 86, 86, 69, 89, 80, 124, 126, 99, 27, Byte.MAX_VALUE, 16, 40, 33, 46, 52, 47, 45, 118, 88, 97, 112, 97, 60, 37, 63, 87, 59, 79, 45, 20, 5, 20, 72, 80, 76, 77, 34, 73, 58, 3, 97, 103, 98, 109, 8, 14, 10, 12, 52, 81, 87, 82, 120, 29, 26, 24, 25, 119, 19, 81, 77, 49, 54, 88, 69, 95, 85, 25, 16, 121, 118, 65, 87, 75, 72, 81, 80, 77, 75, 74, 87, 4, 81, 74, 79, 74, 75, 83, 74, 10, 4, 103, 75, 64, 65, 71, 4, 73, 69, 92, 4, 86, 65, 87, 75, 72, 81, 80, 77, 75, 74, 30, 4, 27, 30, 24, 101, 12, 28, 30, 121, 125, 68, 123, 118, 99, 114, 72, 71, 101, 120, 107, 125, 12, 18, 8, 12, 15, 121, 1, 23, 102, 120, 98, 102, 101, 13, 51, 37, 84, 74, 95, 82, 87, 33, 68, 82, 35, 61, 40, 37, 32, 93, 15, 52, 52, 123, 54, 58, 53, 34, 123, 40, 47, 41, 62, 58, 54, 123, 56, 51, 58, 53, 60, 62, 40, 119, 123, 40, 52, 123, 63, 41, 52, 43, 43, 50, 53, 60, 123, 52, 61, 61, 40, 62, 47, 97, 123, 67, 36, 64, 36, 37, 81, 84, 55, 84, 44, 71, 43, 60, 63, 12, 17, 102, 12, 27, 23, 114, 117, 117, 112, 86, 61, 62, 83, 92, 94, 67, 14, 108, 100, 25, 93, 32, 91, 66, 86, 71, 74, 76, 14, 80, 70, 80, 80, 74, 76, 77, 14, 74, 71, 9, 29, 28, 7, 69, 14, 26, 11, 29, 12, 17, 14, 83, 28, 17, 10, 10, 17, 19, 11, 26, 7, 24, 69, 4, 13, 14, 28, 32, 49, 44, 51, 110, 49, 42, 36, 43, 55, 95, 78, 83, 76, 17, 72, 83, 76, 103, 114, 53, 58, 47, 106, 30, 31, 24, 96, 118, 107, 116, 82, 109, 96, 97, 107, 70, 113, 98, 98, 97, 118, 107, 97, 98, 10, 3, 31, 24, 9, 30, 45, 57, 42, 38, 46, 102, 57, 42, 63, 46, 126, 107, 112, Byte.MAX_VALUE, Byte.MAX_VALUE, 112, 119, 43, 38, 42, 36, 43, 55, 54, 42, 61, 1, 59, 107, 104, 51, 50, 1, 58, 42, 43, 50, 59, 36, 18, 31, 22, 126, 27, 120, 115, 
        112, 125, 125, 41, 38, 34, 36, 78, 40, 41, 33, 39, 84, 79, 84, 78, 11, 13, 13, 16, 1, 8, 59, 55, 80, 85, 64, 24, 82, 70, 94, 79, 67, 68, 89, 111, 102, 92, 123, 53, 55, 59, 52, 52, 51, 52, 61, 123, 119, 100, Byte.MAX_VALUE, 120, 121, 73, 112, 57, 53, 44, 121, 60, 49, 61, 51, 60, 32, 19, 31, 6, 83, 23, 16, 14, 11, 10, 83, 13, 23, 4, 27, 45, 33, 56, 109, 55, 41, 36, 52, 40, 54, 51, 109, 105, 100, 111, 76, 72, 76, 68, 96, 111, 99, 111, 122, 102, 18, 21, 31, 23, 16, 29, 9, 15, 35, 26, 79, 13, 14, 13, 56, 41, 38, 45, 36, 36, 23, 44, 50, 35, 44, 39, 46, 46, 29, 38, 46, 90, 75, 68, 79, 70, 70, 117, 78, 89, 112, 97, 110, 101, 108, 108, 95, 100, 116, 83, 81, 74, 76, 81, 74, 87, 90, 70, 81, 88, 81, 85, 71, 81, 123, 65, 64, 68, 65, 64, 118, 65, 82, 82, 81, 70, 27, 6, 29, 8, 29, 0, 6, 7, 68, 13, 12, 14, 27, 12, 12, 26, 113, 59, 50, 55, 122, 50, 51, 58, 65, 83, 92, 70, 93, 92, 91, 110, 118, 116, 109, 75, 116, 121, 120, 114, 95, 104, 123, 123, 120, 111, 71, 82, 90, 87, 92, 108, 65, 92, 68, 74, 93, 82, 97, 91, 75, 12, 13, 22, 22, 29, 20, 29, 28, 85, 8, 20, 25, 1, 26, 25, 27, 19, 29, 14, 25, 5, 14, 14, 52, 38, 94, 62, 33, 44, 45, 39, 103, 123, 47, 56, 56, 55, 40, 37, 36, 46, 110, 32, 55, 34, 0, 31, 18, 19, 25, 89, 30, 19, 0, 21, 38, 57, 52, 53, 63, Byte.MAX_VALUE, 61, 32, 100, 38, 125, 53, 35, 68, 91, 86, 87, 93, 29, 74, 31, 68, 92, 86, 28, 93, 92, 0, 28, 68, 66, 10, 50, 45, 32, 33, 43, 107, 60, 105, 50, 42, 32, 106, 43, 42, 118, 106, 50, 52, 125, 97, 119, 98, 101, 121, 120, 110, 113, 96, 107, 124, 125, 61, 35, 46, 62, 34, 15, 23, 23, 28, 11, 39, 30, 115, 107, 107, 96, 119, 91, 98, 106, 67};
    }

    static {
        A0D();
        A0f = new int[]{1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    public C3F(Context context, DM dm, long j10, InterfaceC0495Bc<FrameworkMediaCrypto> interfaceC0495Bc, boolean z10, Handler handler, InterfaceC0658Id interfaceC0658Id, int i10) {
        super(2, dm, interfaceC0495Bc, z10);
        this.A0U = j10;
        this.A0T = i10;
        Context applicationContext = context.getApplicationContext();
        this.A0V = applicationContext;
        this.A0W = new IT(applicationContext);
        this.A0X = new C0657Ic(handler, interfaceC0658Id);
        this.A0Y = A0M();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(DG dg, Format format) {
        if (format.A09 != -1) {
            int i10 = 0;
            int i11 = format.A0P.size();
            for (int initializationDataCount = 0; initializationDataCount < i11; initializationDataCount++) {
                int totalInitializationDataSize = format.A0P.get(initializationDataCount).length;
                i10 += totalInitializationDataSize;
            }
            int i12 = format.A09;
            int initializationDataCount2 = A0e[4].charAt(25);
            if (initializationDataCount2 == 101) {
                throw new RuntimeException();
            }
            A0e[5] = "PFjSJxahL7zuosjl0ltO07DmFDIUFrxC";
            return i12 + i10;
        }
        return A01(dg, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r5.A05 != false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A01(com.meta.analytics.dsp.uinode.DG r5, java.lang.String r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A01(com.facebook.ads.redexgen.X.DG, java.lang.String, int, int):int");
    }

    private final MediaFormat A03(Format format, IP ip, boolean z10, int i10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1094, 4, 120), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 19), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 26), format.A08);
        DS.A06(mediaFormat, format.A0P);
        DS.A03(mediaFormat, A05(954, 10, 18), format.A01);
        DS.A04(mediaFormat, A05(1180, 16, 48), format.A0B);
        DS.A02(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 25), ip.A02);
        mediaFormat.setInteger(A05(1055, 10, 13), ip.A00);
        DS.A04(mediaFormat, A05(1065, 14, 39), ip.A01);
        if (IF.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 122), 0);
        }
        if (z10) {
            String strA05 = A05(875, 8, 49);
            if (A0e[5].charAt(18) != 't') {
                throw new RuntimeException();
            }
            A0e[5] = "LIFMuRLmQz6XdmDBeptCblAg9hMw0FnF";
            mediaFormat.setInteger(strA05, 0);
        }
        if (i10 != 0) {
            A0K(mediaFormat, i10);
        }
        return mediaFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.meta.analytics.dsp.uinode.IP A04(com.meta.analytics.dsp.uinode.DG r10, com.facebook.ads.internal.exoplayer2.thirdparty.Format r11, com.facebook.ads.internal.exoplayer2.thirdparty.Format[] r12) throws com.meta.analytics.dsp.uinode.DP {
        /*
            r9 = this;
            int r5 = r11.A0F
            int r4 = r11.A08
            int r3 = A00(r10, r11)
            int r1 = r12.length
            r0 = 1
            if (r1 != r0) goto L12
            com.facebook.ads.redexgen.X.IP r0 = new com.facebook.ads.redexgen.X.IP
            r0.<init>(r5, r4, r3)
            return r0
        L12:
            r8 = 0
            int r6 = r12.length
            r2 = 0
        L15:
            if (r2 >= r6) goto L45
            r7 = r12[r2]
            boolean r0 = r10.A03
            boolean r0 = A0V(r0, r11, r7)
            if (r0 == 0) goto L40
            int r0 = r7.A0F
            r1 = -1
            if (r0 == r1) goto L2a
            int r0 = r7.A08
            if (r0 != r1) goto L43
        L2a:
            r0 = 1
        L2b:
            r8 = r8 | r0
            int r0 = r7.A0F
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = r7.A08
            int r4 = java.lang.Math.max(r4, r0)
            int r0 = A00(r10, r7)
            int r3 = java.lang.Math.max(r3, r0)
        L40:
            int r2 = r2 + 1
            goto L15
        L43:
            r0 = 0
            goto L2b
        L45:
            if (r8 == 0) goto Lc2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r2 = 683(0x2ab, float:9.57E-43)
            r1 = 43
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = A05(r2, r1, r0)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.StringBuilder r6 = r0.append(r5)
            r2 = 1379(0x563, float:1.932E-42)
            r1 = 1
            r0 = 98
            java.lang.String r8 = A05(r2, r1, r0)
            java.lang.StringBuilder r0 = r6.append(r8)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r6 = r0.toString()
            r2 = 522(0x20a, float:7.31E-43)
            r1 = 23
            r0 = 33
            java.lang.String r7 = A05(r2, r1, r0)
            android.util.Log.w(r7, r6)
            android.graphics.Point r1 = A02(r10, r11)
            if (r1 == 0) goto Lc2
            int r0 = r1.x
            int r5 = java.lang.Math.max(r5, r0)
            int r0 = r1.y
            int r4 = java.lang.Math.max(r4, r0)
            java.lang.String r0 = r11.A0O
            int r0 = A01(r10, r0, r5, r4)
            int r3 = java.lang.Math.max(r3, r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r2 = 164(0xa4, float:2.3E-43)
            r1 = 34
            r0 = 75
            java.lang.String r0 = A05(r2, r1, r0)
            java.lang.StringBuilder r0 = r6.append(r0)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r7, r0)
        Lc2:
            com.facebook.ads.redexgen.X.IP r0 = new com.facebook.ads.redexgen.X.IP
            r0.<init>(r5, r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A04(com.facebook.ads.redexgen.X.DG, com.facebook.ads.internal.exoplayer2.thirdparty.Format, com.facebook.ads.internal.exoplayer2.thirdparty.Format[]):com.facebook.ads.redexgen.X.IP");
    }

    private void A06() {
        MediaCodec mediaCodecA1D;
        this.A0R = false;
        if (IF.A02 >= 23 && this.A0S && (mediaCodecA1D = A1D()) != null) {
            this.A00 = new IQ(this, mediaCodecA1D);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long now = this.A0H;
            long elapsedMs = jElapsedRealtime - now;
            this.A0X.A02(this.A09, elapsedMs);
            this.A09 = 0;
            this.A0H = jElapsedRealtime;
        }
    }

    private void A09() {
        int i10 = this.A08;
        if (i10 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != i10 || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            this.A0X.A01(i10, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        int i10 = this.A0E;
        if (i10 == -1) {
            int i11 = this.A0C;
            String[] strArr = A0e;
            if (strArr[0].charAt(20) != strArr[2].charAt(20)) {
                throw new RuntimeException();
            }
            A0e[6] = "GSr0Qxmd2Qhu1M0N5tyB3p9H4Vler7W";
            if (i11 == -1) {
                return;
            }
        }
        this.A0X.A01(i10, this.A0C, this.A0D, this.A03);
    }

    private void A0C() {
        long jElapsedRealtime;
        if (this.A0U > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + this.A0U;
        } else {
            jElapsedRealtime = -9223372036854775807L;
        }
        this.A0J = jElapsedRealtime;
    }

    private final void A0E(int i10) {
        super.A0U.A02 += i10;
        this.A09 += i10;
        this.A05 += i10;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0F(MediaCodec mediaCodec, int i10, long j10) {
        IC.A02(A05(930, 15, 93));
        mediaCodec.releaseOutputBuffer(i10, false);
        IC.A00();
        A0E(1);
    }

    private final void A0G(MediaCodec mediaCodec, int i10, long j10) {
        A09();
        IC.A02(A05(1161, 19, 109));
        mediaCodec.releaseOutputBuffer(i10, true);
        IC.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    private final void A0H(MediaCodec mediaCodec, int i10, long j10) {
        IC.A02(A05(1211, 15, 68));
        mediaCodec.releaseOutputBuffer(i10, false);
        IC.A00();
        super.A0U.A08++;
    }

    private final void A0I(MediaCodec mediaCodec, int i10, long j10, long j11) {
        A09();
        IC.A02(A05(1161, 19, 109));
        mediaCodec.releaseOutputBuffer(i10, j11);
        IC.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1S();
    }

    public static void A0J(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    public static void A0K(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 33), true);
        mediaFormat.setInteger(A05(859, 16, 122), i10);
    }

    private void A0L(Surface surface) throws C04449c {
        if (surface == null) {
            if (this.A0N != null) {
                surface = this.A0N;
            } else {
                DG dgA1E = A1E();
                if (dgA1E != null && A0T(dgA1E)) {
                    this.A0N = DummySurface.A01(this.A0V, dgA1E.A05);
                    surface = this.A0N;
                }
            }
        }
        if (this.A0O != surface) {
            this.A0O = surface;
            if (A0e[3].charAt(22) != 'Z') {
                throw new RuntimeException();
            }
            A0e[5] = "451d0u4cD9rJ2w2guGtx9AsvugCig8Nc";
            int iA81 = A81();
            if (iA81 == 1 || iA81 == 2) {
                MediaCodec mediaCodecA1D = A1D();
                if (IF.A02 >= 23 && mediaCodecA1D != null && surface != null && !this.A0Q) {
                    A0J(mediaCodecA1D, surface);
                } else {
                    A1H();
                    A1J();
                }
            }
            if (surface != null && surface != this.A0N) {
                A0B();
                A06();
                if (iA81 == 2) {
                    A0C();
                    return;
                }
                return;
            }
            A07();
            if (A0e[5].charAt(18) == 't') {
                A0e[3] = "pSIGciD2qJewSpKsBqH446Zc9mkVUpAR";
                A06();
                return;
            } else {
                A06();
                return;
            }
        }
        if (surface != null) {
            Surface surface2 = this.A0N;
            String[] strArr = A0e;
            if (strArr[1].length() == strArr[7].length()) {
                String[] strArr2 = A0e;
                strArr2[1] = "4gXhdQ7K18codO";
                strArr2[7] = "dCZzuzcRJjaMd3";
                if (surface == surface2) {
                    return;
                }
            } else if (surface == surface2) {
                return;
            }
            A0B();
            A0A();
        }
    }

    public static boolean A0M() {
        return IF.A02 <= 22 && A05(948, 6, 53).equals(IF.A03) && A05(545, 6, 101).equals(IF.A05);
    }

    public static boolean A0N(long j10) {
        return j10 < -30000;
    }

    public static boolean A0O(long j10) {
        return j10 < -500000;
    }

    private final boolean A0P(long j10, long j11) {
        return A0O(j10);
    }

    private final boolean A0Q(long j10, long j11) {
        return A0N(j10);
    }

    private final boolean A0R(long j10, long j11) {
        return A0N(j10) && j11 > 100000;
    }

    private final boolean A0S(MediaCodec mediaCodec, int i10, long j10, long j11) throws C04449c {
        int iA10 = A10(j11);
        if (iA10 == 0) {
            return false;
        }
        BC bc2 = super.A0U;
        int droppedSourceBufferCount = bc2.A03;
        bc2.A03 = droppedSourceBufferCount + 1;
        int droppedSourceBufferCount2 = this.A04;
        A0E(droppedSourceBufferCount2 + iA10);
        A1G();
        return true;
    }

    private boolean A0T(DG dg) {
        return IF.A02 >= 23 && !this.A0S && !A0U(dg.A02) && (!dg.A05 || DummySurface.A05(this.A0V));
    }

    /* JADX WARN: Removed duplicated region for block: B:368:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x093a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean A0U(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 3110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A0U(java.lang.String):boolean");
    }

    public static boolean A0V(boolean z10, Format format, Format format2) {
        return format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z10 || (format.A0F == format2.A0F && format.A08 == format2.A08)) && IF.A0g(format.A0J, format2.A0J);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j, com.meta.analytics.dsp.uinode.EM
    public final void A13() {
        super.A13();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j, com.meta.analytics.dsp.uinode.EM
    public final void A14() {
        this.A0J = -9223372036854775807L;
        A08();
        super.A14();
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j, com.meta.analytics.dsp.uinode.EM
    public final void A15() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A08();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A15();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j, com.meta.analytics.dsp.uinode.EM
    public final void A16(long j10, boolean z10) throws C04449c {
        super.A16(j10, z10);
        A06();
        this.A0I = -9223372036854775807L;
        this.A05 = 0;
        this.A0K = -9223372036854775807L;
        int i10 = this.A0A;
        if (i10 != 0) {
            this.A0M = this.A0Z[i10 - 1];
            this.A0A = 0;
        }
        if (z10) {
            A0C();
        } else {
            this.A0J = -9223372036854775807L;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j, com.meta.analytics.dsp.uinode.EM
    public final void A17(boolean z10) throws C04449c {
        super.A17(z10);
        int i10 = A12().A00;
        this.A0G = i10;
        this.A0S = i10 != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A09();
    }

    @Override // com.meta.analytics.dsp.uinode.EM
    public final void A18(Format[] formatArr, long j10) throws C04449c {
        if (this.A0M == -9223372036854775807L) {
            this.A0M = j10;
        } else {
            int i10 = this.A0A;
            if (i10 == this.A0Z.length) {
                Log.w(A05(522, 23, 33), A05(776, 45, 2) + this.A0Z[this.A0A - 1]);
            } else {
                int i11 = i10 + 1;
                String[] strArr = A0e;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0e[4] = "ShVF99lXvOUYr05H2Tvsc9mrs3vvqIZt";
                this.A0A = i11;
            }
            long[] jArr = this.A0Z;
            int i12 = this.A0A;
            jArr[i12 - 1] = j10;
            this.A0a[i12 - 1] = this.A0K;
        }
        super.A18(formatArr, j10);
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final int A1B(MediaCodec mediaCodec, DG dg, Format format, Format format2) {
        if (A0V(dg.A03, format, format2) && format2.A0F <= this.A0P.A02 && format2.A08 <= this.A0P.A00 && A00(dg, format2) <= this.A0P.A01) {
            if (format.A0K(format2)) {
                return 1;
            }
            return 3;
        }
        return 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bc != com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A1C(com.meta.analytics.dsp.uinode.DM r10, com.meta.analytics.dsp.uinode.InterfaceC0495Bc<com.facebook.ads.internal.exoplayer2.thirdparty.drm.FrameworkMediaCrypto> r11, com.facebook.ads.internal.exoplayer2.thirdparty.Format r12) throws com.meta.analytics.dsp.uinode.DP {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A1C(com.facebook.ads.redexgen.X.DM, com.facebook.ads.redexgen.X.Bc, com.facebook.ads.internal.exoplayer2.thirdparty.Format):int");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final void A1G() throws C04449c {
        super.A1G();
        this.A04 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final void A1H() {
        try {
            super.A1H();
            this.A04 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                Surface surface2 = this.A0O;
                String[] strArr = A0e;
                if (strArr[1].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0e[5] = "XHzJ2HWKwUKgXdkRP5t1s0JJnuLP0pfM";
                if (surface2 == surface) {
                    this.A0O = null;
                }
                surface.release();
                this.A0N = null;
            }
        } catch (Throwable th) {
            this.A04 = 0;
            if (this.A0N != null) {
                Surface surface3 = this.A0O;
                Surface surface4 = this.A0N;
                if (surface3 == surface4) {
                    this.A0O = null;
                }
                surface4.release();
                this.A0N = null;
            }
            throw th;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final void A1K(long j10) {
        this.A04--;
        while (true) {
            int i10 = this.A0A;
            if (i10 == 0) {
                return;
            }
            long j11 = this.A0a[0];
            if (A0e[4].charAt(25) == 'e') {
                throw new RuntimeException();
            }
            A0e[6] = "welnO5ckQSDvaPJP3GxM6gJ3";
            if (j10 >= j11) {
                long[] jArr = this.A0Z;
                this.A0M = jArr[0];
                int i11 = i10 - 1;
                this.A0A = i11;
                System.arraycopy(jArr, 1, jArr, 0, i11);
                long[] jArr2 = this.A0a;
                System.arraycopy(jArr2, 1, jArr2, 0, this.A0A);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A1L(android.media.MediaCodec r9, android.media.MediaFormat r10) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A1L(android.media.MediaCodec, android.media.MediaFormat):void");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final void A1M(Format format) throws C04449c {
        super.A1M(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final void A1N(C1051Xr c1051Xr) {
        this.A04++;
        this.A0K = Math.max(c1051Xr.A00, this.A0K);
        if (IF.A02 < 23 && this.A0S) {
            A1S();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final void A1O(DG dg, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws DP {
        IP ipA04 = A04(dg, format, A1A());
        this.A0P = ipA04;
        MediaFormat mediaFormatA03 = A03(format, ipA04, this.A0Y, this.A0G);
        if (this.A0O == null) {
            AbstractC0629Ha.A04(A0T(dg));
            if (this.A0N == null) {
                this.A0N = DummySurface.A01(this.A0V, dg.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(mediaFormatA03, this.A0O, mediaCrypto, 0);
        if (IF.A02 >= 23 && this.A0S) {
            this.A00 = new IQ(this, mediaCodec);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final void A1P(String str, long j10, long j11) {
        this.A0X.A07(str, j10, j11);
        this.A0Q = A0U(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (A0R(r8, r19 - r4) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r9 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        if (r9 != false) goto L45;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A1Q(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42) throws java.lang.InterruptedException, com.meta.analytics.dsp.uinode.C04449c {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A1Q(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean):boolean");
    }

    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j
    public final boolean A1R(DG dg) {
        return this.A0O != null || A0T(dg);
    }

    public final void A1S() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.EM, com.meta.analytics.dsp.uinode.A7
    public final void A8V(int i10, Object obj) throws C04449c {
        if (i10 == 1) {
            A0L((Surface) obj);
            return;
        }
        if (i10 == 4) {
            this.A0F = ((Integer) obj).intValue();
            MediaCodec mediaCodecA1D = A1D();
            if (mediaCodecA1D == null) {
                return;
            }
            int i11 = this.A0F;
            if (A0e[6].length() == 11) {
                throw new RuntimeException();
            }
            A0e[4] = "ynW9njiEKJeSgaNYH6SlaayD7qz19oDR";
            mediaCodecA1D.setVideoScalingMode(i11);
            return;
        }
        super.A8V(i10, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r9.A0S == false) goto L20;
     */
    @Override // com.meta.analytics.dsp.uinode.AbstractC03846j, com.meta.analytics.dsp.uinode.Y5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A9C() {
        /*
            r9 = this;
            boolean r0 = super.A9C()
            r8 = 1
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L3f
            boolean r0 = r9.A0R
            if (r0 != 0) goto L36
            android.view.Surface r1 = r9.A0N
            if (r1 == 0) goto L18
            android.view.Surface r0 = r9.A0O
            if (r0 == r1) goto L36
        L18:
            android.media.MediaCodec r5 = r9.A1D()
            java.lang.String[] r1 = com.meta.analytics.dsp.uinode.C3F.A0e
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 11
            if (r1 == r0) goto L39
            java.lang.String[] r2 = com.meta.analytics.dsp.uinode.C3F.A0e
            java.lang.String r1 = "3hQTJaHLIy4JZfUSwiFMMfqMh"
            r0 = 6
            r2[r0] = r1
            if (r5 == 0) goto L36
            boolean r0 = r9.A0S
            if (r0 == 0) goto L3f
        L36:
            r9.A0J = r3
            return r8
        L39:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3f:
            long r1 = r9.A0J
            r7 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L47
            return r7
        L47:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r1 = r9.A0J
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L52
            return r8
        L52:
            r9.A0J = r3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C3F.A9C():boolean");
    }
}
