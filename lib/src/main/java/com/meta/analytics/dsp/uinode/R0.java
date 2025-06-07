package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class R0 {
    public static R0 A09;
    public static byte[] A0A;
    public static final DownloadAction.Deserializer[] A0B;
    public EG A00;
    public HK A01;
    public File A02;
    public boolean A03;
    public final C1072Ym A06;
    public final E9 A07;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final SparseArray<C0880Qy> A05 = new SparseArray<>();
    public final Runnable A08 = new RunnableC0879Qx(this);

    public static String A07(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0C() {
        A0A = new byte[]{-103, -69, -14, -19, -34, -20, -77, -103, -69, -3, 20, 15, 0, 14, -69, -24, 19, 27, 18, 16, 19, 5, 8, 9, 8, -46, -60, -9, 24, 5, 24, 9, -34, -60, 27, 72, 72, 69, 72, 4, -10, 41, 74, 55, 74, 59, 16, -10, -44, -31, -13, -21, 33, 36, 46, 55, -19, 33, 35, 52, 41, 47, 46, 51, -40, -37, -27, -18, -92, -37, -26, -18, -27, -29, -26, -40, -37, -22, 33, 36, 51, -40, -42, -40, -35, -38};
    }

    static {
        A0C();
        A0B = new DownloadAction.Deserializer[]{WY.A03};
    }

    public R0(C1072Ym c1072Ym, EG eg) {
        C0699Jw c0699Jw = new C0699Jw(this);
        this.A07 = c0699Jw;
        this.A06 = c1072Ym;
        if (eg != null) {
            this.A00 = eg;
            eg.A0Q(c0699Jw);
        }
        A01().A0P();
    }

    private synchronized EG A01() {
        if (this.A00 == null) {
            EG eg = new EG(new EL(A03(), A02()), 10, 5, new File(A06(), A07(52, 12, 89)), A0B);
            this.A00 = eg;
            eg.A0Q(this.A07);
        }
        return this.A00;
    }

    private AnonymousClass41 A02() {
        return new AnonymousClass41(A07(78, 3, 89), null);
    }

    private final synchronized HK A03() {
        if (this.A01 == null) {
            this.A01 = new C0991Vg(new File(A06(), A07(64, 14, 16)), new C0503Bk(C0662Ih.A0P(this.A06)));
        }
        return this.A01;
    }

    public static C0994Vj A04(C1010Vz c1010Vz, HK hk) {
        return new C0994Vj(hk, c1010Vz, new C1006Vv(), null, 2, null);
    }

    public static synchronized R0 A05(C1072Ym c1072Ym) {
        if (A09 == null) {
            A09 = new R0(c1072Ym, null);
        }
        return A09;
    }

    private File A06() {
        if (this.A02 == null) {
            this.A02 = this.A06.getCacheDir();
        }
        return this.A02;
    }

    public static String A08(C1072Ym c1072Ym, Uri uri) {
        try {
            if (!C0662Ih.A1T(c1072Ym)) {
                return null;
            }
            return new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        } catch (URISyntaxException e5) {
            c1072Ym.A07().A9a(A07(81, 5, 14), C8A.A0u, new C8B(e5));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        for (EF ef : A01().A0S()) {
            int taskId = ef.A02;
            C0880Qy c0880Qy = this.A05.get(taskId);
            if (c0880Qy != null) {
                int i10 = ef.A01;
                if (i10 == 2 || ef.A03 > c0880Qy.A00) {
                    String str = A07(15, 19, 61) + i10 + A07(0, 8, 18) + ef.A03;
                    c0880Qy.A01.ABL(c0880Qy.A02);
                    this.A05.remove(taskId);
                } else if (i10 == 4 || i10 == 3) {
                    String str2 = A07(34, 14, 111) + i10;
                    c0880Qy.A01.ABT(ef.A05);
                    this.A05.remove(taskId);
                }
            }
            String str3 = A07(48, 4, 25) + taskId + A07(8, 7, 52) + ef.A03;
        }
    }

    private void A0A() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.post(this.A08);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        this.A04.removeCallbacks(this.A08);
        this.A03 = false;
    }

    public final C0994Vj A0F(Context context) {
        return A04(new C1010Vz(context, (HG<? super InterfaceC0624Gu>) null, A02()), A03());
    }

    public final void A0G(Uri uri, InterfaceC0881Qz interfaceC0881Qz, long j10) {
        String strA08 = A08(this.A06, uri);
        if (strA08 == null) {
            strA08 = uri.toString();
        }
        boolean zA0H = A0H(strA08);
        this.A05.put(A01().A0O(new WY(uri, false, null, strA08)), new C0880Qy(interfaceC0881Qz, j10, zA0H, null));
        A0A();
    }

    public final boolean A0H(String str) {
        return A03().A6G(str, 0L, 1L) > 0;
    }
}
