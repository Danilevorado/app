package com.meta.analytics.dsp.uinode;

import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class EP extends AbstractC1069Yj<String> {
    public static byte[] A08;
    public static String[] A09 = {"l", "T0JdG9ZEnLfTeCeftC9G7d8cUsVG3XZb", "aLcPLzyPnyiGnlL0eBnocVG2Im", "W3EwFUE7CvVeZV", "t2q4fu0Y0bIBimY2SigNyotMmunbmEsF", "TUpEXXUjgi8xLksArOVlucAVZCM", "AqOn5F5Mae0spU5kh0gbanyLcs", "chqW8UrgIl8Ef4OOKimE4h"};
    public final /* synthetic */ double A00;
    public final /* synthetic */ double A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C04077o A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ Map A07;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A08 = new byte[]{-112, -115, -96, -115, -114, -115, -97, -111};
    }

    static {
        A02();
    }

    public EP(C04077o c04077o, String str, String str2, int i10, double d10, double d11, String str3, Map map) {
        this.A03 = c04077o;
        this.A06 = str;
        this.A05 = str2;
        this.A02 = i10;
        this.A01 = d10;
        this.A00 = d11;
        this.A04 = str3;
        this.A07 = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.AbstractC04097r
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final String A03() {
        String eventId = A01(0, 8, 12);
        this.A03.A01.A07().A8l(this.A06);
        if (TextUtils.isEmpty(this.A05)) {
            return null;
        }
        C04077o.A08.lock();
        String[] strArr = A09;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        strArr2[1] = "mqnyRlomjFPPGlBu5iJ3A4HRnrnsorAH";
        strArr2[4] = "vLAqNnzkqKgbXCY8NZfbbPBhHyGRm9s6";
        SQLiteDatabase sQLiteDatabaseA0E = null;
        try {
            try {
                sQLiteDatabaseA0E = this.A03.A0E();
                sQLiteDatabaseA0E.beginTransaction();
                String strA0E = this.A03.A02.A0E(this.A03.A03.A0C(this.A05), this.A02, this.A06, this.A01, this.A00, this.A04, this.A07);
                sQLiteDatabaseA0E.setTransactionSuccessful();
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e5) {
                        this.A03.A01.A07().A9a(eventId, C8A.A0z, new C8B(e5));
                    }
                }
                C04077o.A08.unlock();
                return strA0E;
            } catch (Exception e10) {
                A01(C7q.A06);
                this.A03.A01.A07().A9a(eventId, C8A.A0y, new C8B(e10));
                if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                    try {
                        if (sQLiteDatabaseA0E.inTransaction()) {
                            sQLiteDatabaseA0E.endTransaction();
                        }
                    } catch (Exception e11) {
                        this.A03.A01.A07().A9a(eventId, C8A.A0z, new C8B(e11));
                    }
                }
                C04077o.A08.unlock();
                return null;
            }
        } catch (Throwable th) {
            if (sQLiteDatabaseA0E != null && sQLiteDatabaseA0E.isOpen()) {
                try {
                    if (sQLiteDatabaseA0E.inTransaction()) {
                        sQLiteDatabaseA0E.endTransaction();
                    }
                } catch (Exception e12) {
                    this.A03.A01.A07().A9a(eventId, C8A.A0z, new C8B(e12));
                }
            }
            C04077o.A08.unlock();
            throw th;
        }
    }
}
