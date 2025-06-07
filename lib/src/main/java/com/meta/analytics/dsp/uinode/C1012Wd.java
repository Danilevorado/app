package com.meta.analytics.dsp.uinode;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.UrlLinkFrame;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Wd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1012Wd implements DW {
    public static byte[] A01;
    public static String[] A02 = {"mDpfQ0Mg1qMGU0sRUyB4w0yHI9AflFxL", "HrWFAZbBmLlJHBGWXoy88PVYdiXTIEfW", "ZQEIpFlmPj9dChjEJf3cuXBCToBvQGIn", "RQPpjxLwn1F2LqLyPS6YhTLdMSPVP9VK", "XPMzSAYF2Koz19PEH34p5", "swwfqTWHhic8XQtgs9vSQ", "6JbQXNgGm6Rlu9UTMBxnLLi5Rd7F6qFb", "jePmV9Iz"};
    public static final int A03;
    public static final InterfaceC0544Di A04;
    public final InterfaceC0544Di A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static ChapterFrame A06(C0654Hz c0654Hz, int i10, int i11, boolean z10, int i12, InterfaceC0544Di interfaceC0544Di) throws UnsupportedEncodingException {
        int iA06 = c0654Hz.A06();
        int iA02 = A02(c0654Hz.A00, iA06);
        String str = new String(c0654Hz.A00, iA06, iA02 - iA06, A0I(169, 10, 32));
        c0654Hz.A0Y(iA02 + 1);
        int iA08 = c0654Hz.A08();
        int iA082 = c0654Hz.A08();
        long jA0M = c0654Hz.A0M();
        if (jA0M == 4294967295L) {
            jA0M = -1;
        }
        long jA0M2 = c0654Hz.A0M();
        if (jA0M2 == 4294967295L) {
            jA0M2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i13 = iA06 + i10;
        while (c0654Hz.A06() < i13) {
            Id3Frame id3FrameA0B = A0B(i11, c0654Hz, z10, i12, interfaceC0544Di);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, iA08, iA082, jA0M, jA0M2, id3FrameArr);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static GeobFrame A09(C0654Hz c0654Hz, int i10) throws UnsupportedEncodingException {
        int iA0E = c0654Hz.A0E();
        String strA0H = A0H(iA0E);
        byte[] bArr = new byte[i10 - 1];
        c0654Hz.A0c(bArr, 0, i10 - 1);
        int iA02 = A02(bArr, 0);
        String str = new String(bArr, 0, iA02, A0I(169, 10, 32));
        int i11 = iA02 + 1;
        int iA03 = A03(bArr, i11, iA0E);
        String strA0K = A0K(bArr, i11, iA03, strA0H);
        int iA00 = A00(iA0E) + iA03;
        int iA032 = A03(bArr, iA00, iA0E);
        return new GeobFrame(str, strA0K, A0K(bArr, iA00, iA032, strA0H), A0N(bArr, A00(iA0E) + iA032, bArr.length));
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{78, 8, 78, 8, 78, 8, 44, 106, 44, 106, 44, 106, 44, 106, 89, 85, 19, 7, 20, 24, 16, 38, 28, 15, 16, 72, 91, 126, 107, 126, 63, 107, 112, 112, 63, 108, 119, 112, 109, 107, 63, 107, 112, 63, 125, 122, 63, 126, 113, 63, 86, 91, 44, 63, 107, 126, 120, 22, 49, 57, 60, 53, 52, 112, 36, 63, 112, 52, 53, 51, 63, 52, 53, 112, 54, 34, 49, 61, 53, 106, 112, 57, 52, 109, 119, 80, 88, 93, 84, 85, 17, 69, 94, 17, 71, 80, 93, 88, 85, 80, 69, 84, 17, 120, 117, 2, 17, 69, 80, 86, 17, 70, 88, 69, 89, 17, 92, 80, 91, 94, 67, 103, 84, 67, 66, 88, 94, 95, 12, 4, 48, 35, 47, 39, 98, 49, 43, 56, 39, 98, 39, 58, 33, 39, 39, 38, 49, 98, 48, 39, 47, 35, 43, 44, 43, 44, 37, 98, 54, 35, 37, 98, 38, 35, 54, 35, 71, 74, 61, 107, 113, 109, 15, 26, 26, 23, 27, 15, 19, 88, 117, 34, 85, 116, 114, 126, 117, 116, 99, 97, 89, 91, 66, 66, 87, 86, 18, 123, 118, 1, 18, 70, 83, 85, 18, 69, 91, 70, 90, 18, 95, 83, 88, 93, 64, 100, 87, 64, 65, 91, 93, 92, 15, 0, 18, 83, 92, 86, 18, 71, 92, 86, 87, 84, 91, 92, 87, 86, 18, 81, 93, 95, 66, 64, 87, 65, 65, 91, 93, 92, 18, 65, 81, 90, 87, 95, 87, 116, 76, 78, 87, 87, 66, 67, 7, 110, 99, 20, 7, 83, 70, 64, 7, 80, 78, 83, 79, 7, 82, 73, 84, 82, 87, 87, 72, 85, 83, 66, 67, 7, 74, 70, 77, 72, 85, 113, 66, 85, 84, 78, 72, 73, 26, 28, 36, 38, 63, 63, 38, 33, 40, 111, 58, 33, 60, 58, 63, 63, 32, 61, 59, 42, 43, 111, 44, 32, 34, 63, 61, 42, 60, 60, 42, 43, 111, 32, 61, 111, 42, 33, 44, 61, 54, 63, 59, 42, 43, 111, 41, 61, 46, 34, 42, 62, 50, 50, 50, 31, 30, 12, 103, 123, 124, 62, 63, 45, 70, 90, 93, 41, 46, 54, 55, 37, 78, 91, 68, Byte.MAX_VALUE, 116, 105, 97, 116, 114, 101, 116, 117, 49, 119, 120, 99, 98, 101, 49, 101, 121, 99, 116, 116, 49, 115, 104, 101, 116, 98, 49, 126, 119, 49, 88, 85, 34, 49, 101, 112, 118, 49, 121, 116, 112, 117, 116, 99, 43, 49, 19, 40, 53, 51, 54, 54, 41, 52, 50, 35, 34, 102, 37, 46, 39, 52, 39, 37, 50, 35, 52, 102, 35, 40, 37, 41, 34, 47, 40, 33, 97, 110, 110, 110, 70, 66, 78, 72, 74, 0, 21, 17, 29, 27, 25, 83, 22, 12, 25, 27, 81, 85, 89, 95, 93, 23, 82, 72, 95};
    }

    static {
        A0L();
        A04 = new C1013We();
        A03 = IF.A08(A0I(166, 3, 12));
    }

    public C1012Wd() {
        this(null);
    }

    public C1012Wd(InterfaceC0544Di interfaceC0544Di) {
        this.A00 = interfaceC0544Di;
    }

    public static int A00(int i10) {
        if (i10 == 0 || i10 == 3) {
            return 1;
        }
        return 2;
    }

    public static int A01(C0654Hz c0654Hz, int i10) {
        byte[] bArr = c0654Hz.A00;
        for (int iA06 = c0654Hz.A06(); iA06 + 1 < i10; iA06++) {
            int i11 = bArr[iA06];
            if ((i11 & 255) == 255 && bArr[iA06 + 1] == 0) {
                int i12 = iA06 + 2;
                int i13 = iA06 + 1;
                int i14 = (i10 - iA06) - 2;
                String[] strArr = A02;
                String str = strArr[0];
                String str2 = strArr[6];
                int i15 = str.charAt(4);
                if (i15 == str2.charAt(4)) {
                    throw new RuntimeException();
                }
                A02[1] = "GmDFLtMXmPbGQOJzrAUGcq8JFdShu0kr";
                System.arraycopy(bArr, i12, bArr, i13, i14);
                i10--;
            }
        }
        return i10;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0001 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A02(byte[] r1, int r2) {
        /*
        L0:
            int r0 = r1.length
            if (r2 >= r0) goto Lb
            r0 = r1[r2]
            if (r0 != 0) goto L8
            return r2
        L8:
            int r2 = r2 + 1
            goto L0
        Lb:
            int r0 = r1.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1012Wd.A02(byte[], int):int");
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x000d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A03(byte[] r2, int r3, int r4) {
        /*
            int r1 = A02(r2, r3)
            if (r4 == 0) goto L9
            r0 = 3
            if (r4 != r0) goto La
        L9:
            return r1
        La:
            int r0 = r2.length
            int r0 = r0 + (-1)
            if (r1 >= r0) goto L21
            int r0 = r1 % 2
            if (r0 != 0) goto L1a
            int r0 = r1 + 1
            r0 = r2[r0]
            if (r0 != 0) goto L1a
            return r1
        L1a:
            int r0 = r1 + 1
            int r1 = A02(r2, r0)
            goto La
        L21:
            int r0 = r2.length
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1012Wd.A03(byte[], int, int):int");
    }

    public static ApicFrame A04(C0654Hz c0654Hz, int i10, int i11) throws UnsupportedEncodingException {
        int iA02;
        String strA0M;
        int descriptionStartIndex = c0654Hz.A0E();
        String strA0H = A0H(descriptionStartIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c0654Hz.A0c(bArr, 0, encoding2);
        String strA0I = A0I(458, 6, 45);
        String strA0I2 = A0I(169, 10, 32);
        if (i11 == 2) {
            iA02 = 2;
            strA0M = strA0I + IF.A0M(new String(bArr, 0, 3, strA0I2));
            if (A0I(474, 9, 58).equals(strA0M)) {
                strA0M = A0I(464, 10, 126);
            }
        } else {
            iA02 = A02(bArr, 0);
            strA0M = IF.A0M(new String(bArr, 0, iA02, strA0I2));
            if (strA0M.indexOf(47) == -1) {
                strA0M = strA0I + strA0M;
            }
        }
        int encoding3 = iA02 + 1;
        int i12 = bArr[encoding3] & 255;
        int i13 = iA02 + 2;
        int mimeTypeEndIndex = A03(bArr, i13, descriptionStartIndex);
        int encoding4 = mimeTypeEndIndex - i13;
        String str = new String(bArr, i13, encoding4, strA0H);
        int iA00 = A00(descriptionStartIndex) + mimeTypeEndIndex;
        int encoding5 = bArr.length;
        return new ApicFrame(strA0M, str, i12, A0N(bArr, iA00, encoding5));
    }

    public static BinaryFrame A05(C0654Hz c0654Hz, int i10, String str) {
        byte[] bArr = new byte[i10];
        c0654Hz.A0c(bArr, 0, i10);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(C0654Hz c0654Hz, int i10, int i11, boolean z10, int framePosition, InterfaceC0544Di interfaceC0544Di) throws UnsupportedEncodingException {
        int iA06 = c0654Hz.A06();
        int iA02 = A02(c0654Hz.A00, iA06);
        String strA0I = A0I(169, 10, 32);
        String str = new String(c0654Hz.A00, iA06, iA02 - iA06, strA0I);
        c0654Hz.A0Y(iA02 + 1);
        int framePosition2 = c0654Hz.A0E();
        boolean z11 = (framePosition2 & 2) != 0;
        boolean z12 = (framePosition2 & 1) != 0;
        int iA0E = c0654Hz.A0E();
        String[] strArr = new String[iA0E];
        for (int i12 = 0; i12 < iA0E; i12++) {
            int startIndex = c0654Hz.A06();
            int i13 = A02(c0654Hz.A00, startIndex);
            int framePosition3 = i13 - startIndex;
            strArr[i12] = new String(c0654Hz.A00, startIndex, framePosition3, strA0I);
            c0654Hz.A0Y(i13 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i14 = iA06 + i10;
        while (c0654Hz.A06() < i14) {
            String[] strArr2 = A02;
            String str2 = strArr2[4];
            String str3 = strArr2[5];
            int framePosition4 = str2.length();
            if (framePosition4 != str3.length()) {
                throw new RuntimeException();
            }
            String[] strArr3 = A02;
            strArr3[4] = "YQsr0udxa6AlS4ZOrNFlw";
            strArr3[5] = "dBU8ocTiI6WLc8wZTOIXb";
            Id3Frame id3FrameA0B = A0B(i11, c0654Hz, z10, framePosition, interfaceC0544Di);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z11, z12, strArr, id3FrameArr);
    }

    public static CommentFrame A08(C0654Hz c0654Hz, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int textStartIndex = c0654Hz.A0E();
        String strA0H = A0H(textStartIndex);
        byte[] bArr = new byte[3];
        c0654Hz.A0c(bArr, 0, 3);
        String description = new String(bArr, 0, 3);
        int encoding = i10 - 4;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 4;
        c0654Hz.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, textStartIndex);
        String language = new String(data, 0, encoding3, strA0H);
        int iA00 = A00(textStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, textStartIndex);
        String charset = A0K(data, iA00, encoding4, strA0H);
        return new CommentFrame(description, language, charset);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.meta.analytics.dsp.uinode.Dj A0A(com.meta.analytics.dsp.uinode.C0654Hz r9) {
        /*
            int r4 = r9.A04()
            r3 = 10
            r8 = 0
            r2 = 179(0xb3, float:2.51E-43)
            r1 = 10
            r0 = 19
            java.lang.String r7 = A0I(r2, r1, r0)
            if (r4 >= r3) goto L21
            r2 = 26
            r1 = 31
            r0 = 29
            java.lang.String r0 = A0I(r2, r1, r0)
            android.util.Log.w(r7, r0)
            return r8
        L21:
            int r4 = r9.A0G()
            int r0 = com.meta.analytics.dsp.uinode.C1012Wd.A03
            if (r4 == r0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 376(0x178, float:5.27E-43)
            r1 = 48
            r0 = 19
            java.lang.String r0 = A0I(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r7, r0)
            return r8
        L48:
            int r4 = r9.A0E()
            r3 = 1
            r9.A0Z(r3)
            int r6 = r9.A0E()
            int r2 = r9.A0D()
            r0 = 2
            r5 = 4
            if (r4 != r0) goto L73
            r0 = r6 & 64
            if (r0 == 0) goto L71
            r0 = 1
        L61:
            if (r0 == 0) goto L87
            r2 = 189(0xbd, float:2.65E-43)
            r1 = 68
            r0 = 48
            java.lang.String r0 = A0I(r2, r1, r0)
            android.util.Log.w(r7, r0)
            return r8
        L71:
            r0 = 0
            goto L61
        L73:
            r0 = 3
            if (r4 != r0) goto L97
            r0 = r6 & 64
            if (r0 == 0) goto L95
            r0 = 1
        L7b:
            if (r0 == 0) goto L87
            int r0 = r9.A08()
            r9.A0Z(r0)
            int r0 = r0 + 4
            int r2 = r2 - r0
        L87:
            if (r4 >= r5) goto L93
            r0 = r6 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L93
        L8d:
            com.facebook.ads.redexgen.X.Dj r0 = new com.facebook.ads.redexgen.X.Dj
            r0.<init>(r4, r3, r2)
            return r0
        L93:
            r3 = 0
            goto L8d
        L95:
            r0 = 0
            goto L7b
        L97:
            if (r4 != r5) goto Lb8
            r0 = r6 & 64
            if (r0 == 0) goto Lb6
            r0 = 1
        L9e:
            if (r0 == 0) goto Laa
            int r1 = r9.A0D()
            int r0 = r1 + (-4)
            r9.A0Z(r0)
            int r2 = r2 - r1
        Laa:
            r0 = r6 & 16
            if (r0 == 0) goto Lb4
            r0 = 1
        Laf:
            if (r0 == 0) goto L87
            int r2 = r2 + (-10)
            goto L87
        Lb4:
            r0 = 0
            goto Laf
        Lb6:
            r0 = 0
            goto L9e
        Lb8:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 257(0x101, float:3.6E-43)
            r1 = 46
            r0 = 37
            java.lang.String r0 = A0I(r2, r1, r0)
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1012Wd.A0A(com.facebook.ads.redexgen.X.Hz):com.facebook.ads.redexgen.X.Dj");
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01c1 A[Catch: UnsupportedEncodingException -> 0x02c8, all -> 0x02d9, Merged into TryCatch #1 {all -> 0x02d9, UnsupportedEncodingException -> 0x02c8, blocks: (B:95:0x015f, B:166:0x026b, B:173:0x02c8, B:98:0x0169, B:105:0x017f, B:107:0x0187, B:119:0x01c1, B:128:0x01d9, B:142:0x0219, B:149:0x022a, B:157:0x023d, B:163:0x0254, B:164:0x0261), top: B:183:0x0155 }, TRY_ENTER] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame A0B(int r25, com.meta.analytics.dsp.uinode.C0654Hz r26, boolean r27, int r28, com.meta.analytics.dsp.uinode.InterfaceC0544Di r29) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1012Wd.A0B(int, com.facebook.ads.redexgen.X.Hz, boolean, int, com.facebook.ads.redexgen.X.Di):com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame");
    }

    public static PrivFrame A0C(C0654Hz c0654Hz, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        c0654Hz.A0c(bArr, 0, i10);
        int iA02 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, iA02, A0I(169, 10, 32)), A0N(bArr, iA02 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(C0654Hz c0654Hz, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int valueStartIndex = c0654Hz.A0E();
        String strA0H = A0H(valueStartIndex);
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 1;
        c0654Hz.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, valueStartIndex);
        String description = new String(data, 0, encoding3, strA0H);
        int iA00 = A00(valueStartIndex) + encoding3;
        int encoding4 = A03(data, iA00, valueStartIndex);
        String strA0K = A0K(data, iA00, encoding4, strA0H);
        String charset = A0I(353, 4, 104);
        return new TextInformationFrame(charset, description, strA0K);
    }

    public static TextInformationFrame A0E(C0654Hz c0654Hz, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int iA0E = c0654Hz.A0E();
        String strA0H = A0H(iA0E);
        int encoding = i10 - 1;
        byte[] data = new byte[encoding];
        int encoding2 = i10 - 1;
        c0654Hz.A0c(data, 0, encoding2);
        int encoding3 = A03(data, 0, iA0E);
        return new TextInformationFrame(str, null, new String(data, 0, encoding3, strA0H));
    }

    public static UrlLinkFrame A0F(C0654Hz c0654Hz, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int descriptionEndIndex = c0654Hz.A0E();
        String strA0H = A0H(descriptionEndIndex);
        int encoding = i10 - 1;
        byte[] bArr = new byte[encoding];
        int encoding2 = i10 - 1;
        c0654Hz.A0c(bArr, 0, encoding2);
        int encoding3 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, encoding3, strA0H);
        int iA00 = A00(descriptionEndIndex) + encoding3;
        String strA0K = A0K(bArr, iA00, A02(bArr, iA00), A0I(169, 10, 32));
        String charset = A0I(454, 4, 52);
        return new UrlLinkFrame(charset, str, strA0K);
    }

    public static UrlLinkFrame A0G(C0654Hz c0654Hz, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        c0654Hz.A0c(bArr, 0, i10);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 32)));
    }

    public static String A0H(int i10) {
        String strA0I = A0I(169, 10, 32);
        switch (i10) {
            case 0:
                return strA0I;
            case 1:
                return A0I(357, 6, 72);
            case 2:
                return A0I(363, 8, 105);
            case 3:
                String strA0I2 = A0I(371, 5, 97);
                String[] strArr = A02;
                if (strArr[0].charAt(4) == strArr[6].charAt(4)) {
                    throw new RuntimeException();
                }
                A02[7] = "WB3CnC";
                return strA0I2;
            default:
                return strA0I;
        }
    }

    public static String A0J(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, A0I(0, 6, 105), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, A0I(6, 8, 11), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    public static String A0K(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, str);
        }
        String[] strArr = A02;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[0] = "r4Qi0WBzOYfLLA4UC9s9DAK76ksjAQPp";
        strArr2[6] = "c5jPrSHyFK7RFs6Pjjym9ojkSMFCl1O5";
        return A0I(0, 0, 121);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0M(com.meta.analytics.dsp.uinode.C0654Hz r16, int r17, int r18, boolean r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1012Wd.A0M(com.facebook.ads.redexgen.X.Hz, int, int, boolean):boolean");
    }

    public static byte[] A0N(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return new byte[0];
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public final Metadata A0O(byte[] bArr, int i10) {
        ArrayList arrayList = new ArrayList();
        C0654Hz c0654Hz = new C0654Hz(bArr, i10);
        Dj djA0A = A0A(c0654Hz);
        if (djA0A == null) {
            return null;
        }
        int startPosition = c0654Hz.A06();
        int frameHeaderSize = djA0A.A01 == 2 ? 6 : 10;
        int iA01 = djA0A.A00;
        if (djA0A.A02) {
            iA01 = A01(c0654Hz, djA0A.A00);
        }
        c0654Hz.A0X(startPosition + iA01);
        boolean z10 = false;
        if (!A0M(c0654Hz, djA0A.A01, frameHeaderSize, false)) {
            if (djA0A.A01 != 4 || !A0M(c0654Hz, 4, frameHeaderSize, true)) {
                Log.w(A0I(179, 10, 19), A0I(84, 45, 51) + djA0A.A01);
                return null;
            }
            z10 = true;
        }
        while (c0654Hz.A04() >= frameHeaderSize) {
            Id3Frame id3FrameA0B = A0B(djA0A.A01, c0654Hz, z10, frameHeaderSize, this.A00);
            if (id3FrameA0B != null) {
                arrayList.add(id3FrameA0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.meta.analytics.dsp.uinode.DW
    public final Metadata A51(E3 e32) {
        ByteBuffer buffer = e32.A01;
        return A0O(buffer.array(), buffer.limit());
    }
}
