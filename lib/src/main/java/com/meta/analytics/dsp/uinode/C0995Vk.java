package com.meta.analytics.dsp.uinode;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0995Vk implements InterfaceC0624Gu {
    public static byte[] A0L;
    public static String[] A0M = {"BZiYu5nwNf87X3b9kN", "UgTeeMN2jxyMd9Kylf", "PJ", "CPqLt3pCFfCSwfi", "XN4Dvc1", "tWEaaCCiJhgiXtacO5se5vgeqa", "S002dfR", "J7ycXdK5d"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0624Gu A07;
    public HO A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0624Gu A0D;
    public final InterfaceC0624Gu A0E;
    public final InterfaceC0624Gu A0F;
    public final HK A0G;
    public final HM A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 35);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A0L = new byte[]{-92, -93, 120, -106, -104, -99, -102, -103, 119, -82, -87, -102, -88, -121, -102, -106, -103};
    }

    static {
        A06();
    }

    public C0995Vk(HK hk, InterfaceC0624Gu interfaceC0624Gu, InterfaceC0624Gu interfaceC0624Gu2, InterfaceC0622Gs interfaceC0622Gs, int i10, HM hm) {
        this.A0G = hk;
        this.A0D = interfaceC0624Gu2;
        this.A0I = (i10 & 1) != 0;
        this.A0K = (i10 & 2) != 0;
        this.A0J = (i10 & 4) != 0;
        this.A0F = interfaceC0624Gu;
        if (interfaceC0622Gs != null) {
            this.A0E = new C0998Vn(interfaceC0624Gu, interfaceC0622Gs);
        } else {
            this.A0E = null;
        }
        this.A0H = hm;
    }

    private int A00(C0628Gy c0628Gy) {
        if (this.A0K) {
            boolean z10 = this.A0C;
            String[] strArr = A0M;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[3] = "r97zDVaaptRGknr";
            strArr2[6] = "AimjfMN";
            if (z10) {
                if (A0M[7].length() != 14) {
                    A0M[7] = "lgdHkpCnxjAeRqVRog4eGXXV3TVVS";
                    return 0;
                }
                A0M[4] = "GvTYan8nqvP";
                return 0;
            }
        }
        if (this.A0J && c0628Gy.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(HK hk, String str, Uri uri) {
        HU contentMetadata = hk.A6X(str);
        Uri uriA01 = HV.A01(contentMetadata);
        return uriA01 == null ? uri : uriA01;
    }

    private void A03() throws IOException {
        InterfaceC0624Gu interfaceC0624Gu = this.A07;
        if (interfaceC0624Gu == null) {
            return;
        }
        try {
            interfaceC0624Gu.close();
            this.A07 = null;
            this.A0A = false;
            HO ho = this.A08;
            if (A0M[5].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr = A0M;
            strArr[3] = "f78PdfdQFRIsoy9";
            strArr[6] = "Xl8bArW";
            if (ho != null) {
                this.A0G.AEZ(ho);
                this.A08 = null;
            }
        } catch (Throwable th) {
            this.A07 = null;
            this.A0A = false;
            HO ho2 = this.A08;
            if (ho2 != null) {
                this.A0G.AEZ(ho2);
                this.A08 = null;
            }
            throw th;
        }
    }

    private void A04() {
        if (0 != 0 && this.A04 > 0) {
            this.A0G.A6F();
            throw new NullPointerException(A02(0, 17, 18));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AFx(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof HI)) {
            this.A0C = true;
        }
    }

    private void A08(boolean z10) throws IOException {
        HO hoAGV;
        long jMin;
        C0628Gy c0628Gy;
        InterfaceC0624Gu nextDataSource;
        long j10;
        if (this.A0B) {
            hoAGV = null;
        } else if (this.A0I) {
            try {
                hoAGV = this.A0G.AGV(this.A09, this.A03);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            hoAGV = this.A0G.AGW(this.A09, this.A03);
        }
        if (hoAGV == null) {
            nextDataSource = this.A0F;
            c0628Gy = new C0628Gy(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else if (hoAGV.A05) {
            Uri uriFromFile = Uri.fromFile(hoAGV.A03);
            long filePosition = this.A03 - hoAGV.A02;
            long length = hoAGV.A01 - filePosition;
            long j11 = this.A01;
            if (j11 != -1) {
                length = Math.min(length, j11);
            }
            c0628Gy = new C0628Gy(uriFromFile, this.A03, filePosition, length, this.A09, this.A00);
            nextDataSource = this.A0D;
        } else {
            if (hoAGV.A02()) {
                jMin = this.A01;
            } else {
                jMin = hoAGV.A01;
                long length2 = this.A01;
                if (length2 != -1) {
                    jMin = Math.min(jMin, length2);
                }
            }
            c0628Gy = new C0628Gy(this.A06, this.A03, jMin, this.A09, this.A00);
            if (this.A0E != null) {
                nextDataSource = this.A0E;
            } else {
                nextDataSource = this.A0F;
                this.A0G.AEZ(hoAGV);
                hoAGV = null;
            }
        }
        if (!this.A0B && nextDataSource == this.A0F) {
            j10 = this.A03 + 102400;
        } else {
            j10 = Long.MAX_VALUE;
        }
        this.A02 = j10;
        if (z10) {
            AbstractC0629Ha.A04(A09());
            if (nextDataSource == this.A0F) {
                return;
            }
            try {
                A03();
            } catch (Throwable th) {
                if (hoAGV.A01()) {
                    this.A0G.AEZ(hoAGV);
                }
                throw th;
            }
        }
        if (hoAGV != null && hoAGV.A01()) {
            this.A08 = hoAGV;
        }
        this.A07 = nextDataSource;
        this.A0A = c0628Gy.A02 == -1;
        long jADl = nextDataSource.ADl(c0628Gy);
        HW hw = new HW();
        if (this.A0A) {
            if (A0M[2].length() != 2) {
                throw new RuntimeException();
            }
            A0M[7] = "GQ8HbidAJ3";
            if (jADl != -1) {
                this.A01 = jADl;
                HV.A05(hw, this.A03 + jADl);
            }
        }
        if (A0B()) {
            Uri uriA8E = this.A07.A8E();
            this.A05 = uriA8E;
            if (true ^ this.A06.equals(uriA8E)) {
                Uri uri = this.A05;
                if (A0M[5].length() != 26) {
                    HV.A06(hw, uri);
                } else {
                    A0M[4] = "mDcPGOd9V6d2O";
                    HV.A06(hw, uri);
                }
            } else {
                HV.A04(hw);
            }
        }
        if (A0C()) {
            this.A0G.A3a(this.A09, hw);
        }
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    public static boolean A0D(IOException iOException) {
        for (IOException cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0625Gv) && ((C0625Gv) cause).A00 == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final Uri A8E() {
        return this.A05;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final long ADl(C0628Gy c0628Gy) throws IOException {
        try {
            this.A09 = HQ.A02(c0628Gy);
            Uri uri = c0628Gy.A04;
            this.A06 = uri;
            this.A05 = A01(this.A0G, this.A09, uri);
            this.A00 = c0628Gy.A00;
            this.A03 = c0628Gy.A03;
            this.A0B = A00(c0628Gy) != -1;
            if (c0628Gy.A02 != -1 || this.A0B) {
                this.A01 = c0628Gy.A02;
            } else {
                long jA6W = this.A0G.A6W(this.A09);
                this.A01 = jA6W;
                if (jA6W != -1) {
                    long j10 = jA6W - c0628Gy.A03;
                    this.A01 = j10;
                    if (j10 <= 0) {
                        throw new C0625Gv(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e5) {
            A07(e5);
            throw e5;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e5) {
            A07(e5);
            throw e5;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0624Gu
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            if (this.A03 >= this.A02) {
                A08(true);
            }
            int i12 = this.A07.read(bArr, i10, i11);
            if (i12 != -1) {
                if (A0A()) {
                    this.A04 += i12;
                }
                this.A03 += i12;
                long j10 = this.A01;
                if (j10 != -1) {
                    this.A01 = j10 - i12;
                }
            } else if (this.A0A) {
                A05();
            } else {
                long j11 = this.A01;
                if (j11 <= 0) {
                    if (j11 == -1) {
                    }
                }
                A03();
                A08(false);
                return read(bArr, i10, i11);
            }
            return i12;
        } catch (IOException e5) {
            if (this.A0A && A0D(e5)) {
                A05();
                return -1;
            }
            A07(e5);
            throw e5;
        }
    }
}
