package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.facebook.ads.internal.api.AdSizeApi;
import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class ng0 {

    /* renamed from: a, reason: collision with root package name */
    private static final ArrayList f12610a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f12611b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f12612c = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(java.lang.String r7, java.lang.String r8) {
        /*
            int r0 = r7.hashCode()
            r1 = 8
            r2 = 7
            r3 = 9
            r4 = 5
            r5 = 6
            r6 = 0
            switch(r0) {
                case -2123537834: goto L6c;
                case -1095064472: goto L62;
                case -53558318: goto L58;
                case 187078296: goto L4e;
                case 187078297: goto L44;
                case 1504578661: goto L3a;
                case 1504831518: goto L30;
                case 1504891608: goto L26;
                case 1505942594: goto L1c;
                case 1556697186: goto L11;
                default: goto Lf;
            }
        Lf:
            goto L76
        L11:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = r1
            goto L77
        L1c:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = r2
            goto L77
        L26:
            java.lang.String r0 = "audio/opus"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = r3
            goto L77
        L30:
            java.lang.String r0 = "audio/mpeg"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = r6
            goto L77
        L3a:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = 3
            goto L77
        L44:
            java.lang.String r0 = "audio/ac4"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = r4
            goto L77
        L4e:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = 2
            goto L77
        L58:
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = 1
            goto L77
        L62:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = r5
            goto L77
        L6c:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L76
            r7 = 4
            goto L77
        L76:
            r7 = -1
        L77:
            switch(r7) {
                case 0: goto L9a;
                case 1: goto L8b;
                case 2: goto L8a;
                case 3: goto L89;
                case 4: goto L86;
                case 5: goto L83;
                case 6: goto L82;
                case 7: goto L81;
                case 8: goto L7e;
                case 9: goto L7b;
                default: goto L7a;
            }
        L7a:
            return r6
        L7b:
            r7 = 20
            return r7
        L7e:
            r7 = 14
            return r7
        L81:
            return r1
        L82:
            return r2
        L83:
            r7 = 17
            return r7
        L86:
            r7 = 18
            return r7
        L89:
            return r5
        L8a:
            return r4
        L8b:
            if (r8 != 0) goto L8e
            return r6
        L8e:
            com.google.android.gms.internal.ads.mf0 r7 = c(r8)
            if (r7 != 0) goto L95
            return r6
        L95:
            int r7 = r7.a()
            return r7
        L9a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ng0.a(java.lang.String, java.lang.String):int");
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (f(str)) {
            return 1;
        }
        if (g(str)) {
            return 2;
        }
        if ("text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("image".equals(h(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = f12610a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        a5.a.a(arrayList.get(0));
        throw null;
    }

    static mf0 c(String str) {
        Matcher matcher = f12611b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Objects.requireNonNull(strGroup);
        String strGroup2 = matcher.group(2);
        try {
            return new mf0(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String d(int i10) {
        if (i10 == 32) {
            return "video/mp4v-es";
        }
        if (i10 == 33) {
            return "video/avc";
        }
        if (i10 == 35) {
            return "video/hevc";
        }
        if (i10 == 64) {
            return "audio/mp4a-latm";
        }
        if (i10 == 163) {
            return "video/wvc1";
        }
        if (i10 == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i10 == 165) {
            return "audio/ac3";
        }
        if (i10 == 166) {
            return "audio/eac3";
        }
        switch (i10) {
            case 96:
            case 97:
            case 98:
            case 99:
            case AdSizeApi.INTERSTITIAL /* 100 */:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i10) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e(java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.hashCode()
            r2 = 1
            switch(r1) {
                case -2123537834: goto L76;
                case -432837260: goto L6c;
                case -432837259: goto L62;
                case -53558318: goto L57;
                case 187078296: goto L4d;
                case 187094639: goto L43;
                case 1504578661: goto L38;
                case 1504619009: goto L2e;
                case 1504831518: goto L24;
                case 1903231877: goto L19;
                case 1903589369: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L81
        Le:
            java.lang.String r1 = "audio/g711-mlaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 5
            goto L82
        L19:
            java.lang.String r1 = "audio/g711-alaw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 4
            goto L82
        L24:
            java.lang.String r1 = "audio/mpeg"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = r0
            goto L82
        L2e:
            java.lang.String r1 = "audio/flac"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 6
            goto L82
        L38:
            java.lang.String r1 = "audio/eac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 8
            goto L82
        L43:
            java.lang.String r1 = "audio/raw"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 3
            goto L82
        L4d:
            java.lang.String r1 = "audio/ac3"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 7
            goto L82
        L57:
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 10
            goto L82
        L62:
            java.lang.String r1 = "audio/mpeg-L2"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 2
            goto L82
        L6c:
            java.lang.String r1 = "audio/mpeg-L1"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = r2
            goto L82
        L76:
            java.lang.String r1 = "audio/eac3-joc"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L81
            r3 = 9
            goto L82
        L81:
            r3 = -1
        L82:
            switch(r3) {
                case 0: goto L9c;
                case 1: goto L9c;
                case 2: goto L9c;
                case 3: goto L9c;
                case 4: goto L9c;
                case 5: goto L9c;
                case 6: goto L9c;
                case 7: goto L9c;
                case 8: goto L9c;
                case 9: goto L9c;
                case 10: goto L86;
                default: goto L85;
            }
        L85:
            return r0
        L86:
            if (r4 != 0) goto L89
            return r0
        L89:
            com.google.android.gms.internal.ads.mf0 r3 = c(r4)
            if (r3 != 0) goto L90
            return r0
        L90:
            int r3 = r3.a()
            if (r3 == 0) goto L9b
            r4 = 16
            if (r3 == r4) goto L9b
            return r2
        L9b:
            return r0
        L9c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ng0.e(java.lang.String, java.lang.String):boolean");
    }

    public static boolean f(String str) {
        return "audio".equals(h(str));
    }

    public static boolean g(String str) {
        return "video".equals(h(str));
    }

    private static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }
}
