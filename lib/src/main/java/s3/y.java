package s3;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.dn1;
import com.google.android.gms.internal.ads.do2;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.of0;
import com.google.android.gms.internal.ads.sm1;
import java.util.Map;
import k3.c4;
import k3.w0;

/* loaded from: classes.dex */
public abstract class y {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(java.lang.String r1) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = "unspecified"
            return r1
        L9:
            int r0 = r1.hashCode()
            switch(r0) {
                case 1743582862: goto L62;
                case 1743582863: goto L58;
                case 1743582864: goto L4e;
                case 1743582865: goto L44;
                case 1743582866: goto L3a;
                case 1743582867: goto L30;
                case 1743582868: goto L26;
                case 1743582869: goto L1c;
                case 1743582870: goto L11;
                default: goto L10;
            }
        L10:
            goto L6c
        L11:
            java.lang.String r0 = "requester_type_8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 8
            goto L6d
        L1c:
            java.lang.String r0 = "requester_type_7"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 7
            goto L6d
        L26:
            java.lang.String r0 = "requester_type_6"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 6
            goto L6d
        L30:
            java.lang.String r0 = "requester_type_5"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 5
            goto L6d
        L3a:
            java.lang.String r0 = "requester_type_4"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 4
            goto L6d
        L44:
            java.lang.String r0 = "requester_type_3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 3
            goto L6d
        L4e:
            java.lang.String r0 = "requester_type_2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 2
            goto L6d
        L58:
            java.lang.String r0 = "requester_type_1"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 1
            goto L6d
        L62:
            java.lang.String r0 = "requester_type_0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L6c
            r0 = 0
            goto L6d
        L6c:
            r0 = -1
        L6d:
            switch(r0) {
                case 0: goto L89;
                case 1: goto L86;
                case 2: goto L83;
                case 3: goto L80;
                case 4: goto L7d;
                case 5: goto L7a;
                case 6: goto L77;
                case 7: goto L74;
                case 8: goto L71;
                default: goto L70;
            }
        L70:
            return r1
        L71:
            java.lang.String r1 = "8"
            return r1
        L74:
            java.lang.String r1 = "7"
            return r1
        L77:
            java.lang.String r1 = "6"
            return r1
        L7a:
            java.lang.String r1 = "5"
            return r1
        L7d:
            java.lang.String r1 = "4"
            return r1
        L80:
            java.lang.String r1 = "3"
            return r1
        L83:
            java.lang.String r1 = "2"
            return r1
        L86:
            java.lang.String r1 = "1"
            return r1
        L89:
            java.lang.String r1 = "0"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s3.y.a(java.lang.String):java.lang.String");
    }

    public static String b(c4 c4Var) {
        Bundle bundle = c4Var.f24616o;
        return bundle == null ? "unspecified" : bundle.getString("query_info_type");
    }

    public static void c(final dn1 dn1Var, final sm1 sm1Var, final String str, final Pair... pairArr) {
        if (((Boolean) k3.w.c().b(ir.H6)).booleanValue()) {
            of0.f13186a.execute(new Runnable() { // from class: s3.x
                @Override // java.lang.Runnable
                public final void run() {
                    y.d(dn1Var, sm1Var, str, pairArr);
                }
            });
        }
    }

    static void d(dn1 dn1Var, sm1 sm1Var, String str, Pair... pairArr) {
        Map mapC = sm1Var == null ? dn1Var.c() : sm1Var.a();
        f(mapC, "action", str);
        for (Pair pair : pairArr) {
            f(mapC, (String) pair.first, (String) pair.second);
        }
        dn1Var.e(mapC);
    }

    public static int e(do2 do2Var) {
        if (do2Var.f7458q) {
            return 2;
        }
        c4 c4Var = do2Var.f7445d;
        w0 w0Var = c4Var.E;
        if (w0Var == null && c4Var.J == null) {
            return 1;
        }
        if (w0Var == null || c4Var.J == null) {
            return w0Var != null ? 3 : 4;
        }
        return 5;
    }

    private static void f(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
