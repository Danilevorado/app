package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class eg4 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f7764a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f7765b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static int f7766c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f7767d = 0;

    public static int a() {
        int i10;
        int iMax = f7766c;
        if (iMax == -1) {
            kf4 kf4VarC = c("video/avc", false, false);
            if (kf4VarC != null) {
                int iMax2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : kf4VarC.h()) {
                    int i11 = codecProfileLevel.level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                }
                iMax = Math.max(iMax2, sv2.f15560a >= 21 ? 345600 : 172800);
            } else {
                iMax = 0;
            }
            f7766c = iMax;
        }
        return iMax;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a1 A[Catch: NumberFormatException -> 0x023a, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x023a, blocks: (B:149:0x024a, B:151:0x025c, B:162:0x0278, B:178:0x02a1), top: B:500:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair b(com.google.android.gms.internal.ads.k9 r17) {
        /*
            Method dump skipped, instructions count: 2288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eg4.b(com.google.android.gms.internal.ads.k9):android.util.Pair");
    }

    public static kf4 c(String str, boolean z10, boolean z11) {
        List listF = f(str, false, false);
        if (listF.isEmpty()) {
            return null;
        }
        return (kf4) listF.get(0);
    }

    public static kf4 d() {
        return c("audio/raw", false, false);
    }

    public static String e(k9 k9Var) {
        Pair pairB;
        if ("audio/eac3-joc".equals(k9Var.f10898l)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(k9Var.f10898l) || (pairB = b(k9Var)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List f(String str, boolean z10, boolean z11) {
        vf4 vf4Var = new vf4(str, z10, z11);
        HashMap map = f7765b;
        List list = (List) map.get(vf4Var);
        if (list != null) {
            return list;
        }
        int i10 = sv2.f15560a;
        ArrayList arrayListH = h(vf4Var, i10 >= 21 ? new cg4(z10, z11) : new ag4(null));
        if (z10 && arrayListH.isEmpty() && i10 >= 21 && i10 <= 23) {
            arrayListH = h(vf4Var, new ag4(null));
            if (!arrayListH.isEmpty()) {
                ad2.e("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((kf4) arrayListH.get(0)).f11014a);
            }
        }
        if ("audio/raw".equals(str)) {
            if (i10 < 26 && sv2.f15561b.equals("R9") && arrayListH.size() == 1 && ((kf4) arrayListH.get(0)).f11014a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayListH.add(kf4.c("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            i(arrayListH, new dg4() { // from class: com.google.android.gms.internal.ads.tf4
                @Override // com.google.android.gms.internal.ads.dg4
                public final int a(Object obj) {
                    int i11 = eg4.f7767d;
                    String str2 = ((kf4) obj).f11014a;
                    if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                        return 1;
                    }
                    return (sv2.f15560a >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                }
            });
        }
        if (i10 < 21 && arrayListH.size() > 1) {
            String str2 = ((kf4) arrayListH.get(0)).f11014a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                i(arrayListH, new dg4() { // from class: com.google.android.gms.internal.ads.uf4
                    @Override // com.google.android.gms.internal.ads.dg4
                    public final int a(Object obj) {
                        int i11 = eg4.f7767d;
                        return ((kf4) obj).f11014a.startsWith("OMX.google") ? 1 : 0;
                    }
                });
            }
        }
        if (i10 < 32 && arrayListH.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((kf4) arrayListH.get(0)).f11014a)) {
            arrayListH.add((kf4) arrayListH.remove(0));
        }
        c63 c63VarS = c63.s(arrayListH);
        map.put(vf4Var, c63VarS);
        return c63VarS;
    }

    public static List g(List list, final k9 k9Var) {
        ArrayList arrayList = new ArrayList(list);
        i(arrayList, new dg4() { // from class: com.google.android.gms.internal.ads.rf4
            @Override // com.google.android.gms.internal.ads.dg4
            public final int a(Object obj) {
                k9 k9Var2 = k9Var;
                int i10 = eg4.f7767d;
                return ((kf4) obj).d(k9Var2) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ea A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f1 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0204 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0209 A[Catch: Exception -> 0x02a3, TryCatch #5 {Exception -> 0x02a3, blocks: (B:115:0x01b8, B:121:0x01cf, B:127:0x01e4, B:129:0x01ea, B:134:0x01fc, B:136:0x0204, B:146:0x0230, B:137:0x0209, B:139:0x0219, B:141:0x0221, B:130:0x01f1), top: B:195:0x01b8 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02b5 A[Catch: Exception -> 0x0304, TRY_ENTER, TryCatch #4 {Exception -> 0x0304, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0035, B:14:0x0043, B:18:0x004d, B:20:0x0055, B:22:0x005d, B:24:0x0065, B:26:0x006d, B:28:0x0075, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x009b, B:40:0x00a5, B:42:0x00ad, B:44:0x00b5, B:46:0x00bd, B:48:0x00c5, B:50:0x00cd, B:52:0x00d5, B:56:0x00e3, B:58:0x00eb, B:60:0x00f3, B:62:0x00fd, B:64:0x0105, B:66:0x010b, B:68:0x0113, B:71:0x011d, B:73:0x0125, B:77:0x0131, B:79:0x0139, B:81:0x0141, B:83:0x014a, B:172:0x02ad, B:175:0x02b5, B:177:0x02bb, B:178:0x02d5, B:179:0x02f8, B:86:0x0153, B:87:0x0156, B:89:0x015e, B:92:0x0169, B:94:0x0171, B:97:0x017c, B:99:0x0184, B:102:0x018f, B:104:0x0197, B:107:0x01a2, B:109:0x01aa), top: B:193:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02d5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList h(com.google.android.gms.internal.ads.vf4 r27, com.google.android.gms.internal.ads.yf4 r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 780
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eg4.h(com.google.android.gms.internal.ads.vf4, com.google.android.gms.internal.ads.yf4):java.util.ArrayList");
    }

    private static void i(List list, final dg4 dg4Var) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.sf4
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                dg4 dg4Var2 = dg4Var;
                int i10 = eg4.f7767d;
                return dg4Var2.a(obj2) - dg4Var2.a(obj);
            }
        });
    }

    private static boolean j(MediaCodecInfo mediaCodecInfo, String str) {
        if (sv2.f15560a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (ng0.f(str)) {
            return true;
        }
        String strA = n23.a(mediaCodecInfo.getName());
        if (strA.startsWith("arc.")) {
            return false;
        }
        if (strA.startsWith("omx.google.") || strA.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strA.startsWith("omx.sec.") && strA.contains(".sw.")) || strA.equals("omx.qcom.video.decoder.hevcswvdec") || strA.startsWith("c2.android.") || strA.startsWith("c2.google.")) {
            return true;
        }
        return (strA.startsWith("omx.") || strA.startsWith("c2.")) ? false : true;
    }
}
