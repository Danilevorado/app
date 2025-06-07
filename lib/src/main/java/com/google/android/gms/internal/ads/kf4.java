package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kf4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f11014a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11015b;

    /* renamed from: c, reason: collision with root package name */
    public final String f11016c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f11017d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11018e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11019f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11020g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f11021h;

    kf4(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Objects.requireNonNull(str);
        this.f11014a = str;
        this.f11015b = str2;
        this.f11016c = str3;
        this.f11017d = codecCapabilities;
        this.f11020g = z10;
        this.f11018e = z13;
        this.f11019f = z15;
        this.f11021h = ng0.g(str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.kf4 c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.kf4 r11 = new com.google.android.gms.internal.ads.kf4
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.sv2.f15560a
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L3b
            r5 = 22
            if (r3 > r5) goto L39
            java.lang.String r3 = com.google.android.gms.internal.ads.sv2.f15563d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L28
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r8 = r0
            goto L3c
        L3b:
            r8 = r2
        L3c:
            r3 = 21
            if (r4 == 0) goto L4e
            int r5 = com.google.android.gms.internal.ads.sv2.f15560a
            if (r5 < r3) goto L4e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L4e
            r9 = r0
            goto L4f
        L4e:
            r9 = r2
        L4f:
            if (r20 != 0) goto L62
            if (r4 == 0) goto L60
            int r5 = com.google.android.gms.internal.ads.sv2.f15560a
            if (r5 < r3) goto L60
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L60
            goto L62
        L60:
            r10 = r2
            goto L63
        L62:
            r10 = r0
        L63:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kf4.c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.kf4");
    }

    private static Point i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = sv2.f15560a;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void j(String str) {
        ad2.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f11014a + ", " + this.f11015b + "] [" + sv2.f15564e + "]");
    }

    private static boolean k(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointI = i(videoCapabilities, i10, i11);
        int i12 = pointI.x;
        int i13 = pointI.y;
        return (d10 == -1.0d || d10 < 1.0d) ? videoCapabilities.isSizeSupported(i12, i13) : videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    private final boolean l(k9 k9Var, boolean z10) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair pairB = eg4.b(k9Var);
        if (pairB == null) {
            return true;
        }
        int iIntValue = ((Integer) pairB.first).intValue();
        int iIntValue2 = ((Integer) pairB.second).intValue();
        int i10 = 8;
        if ("video/dolby-vision".equals(k9Var.f10898l)) {
            if ("video/avc".equals(this.f11015b)) {
                iIntValue = 8;
            } else if ("video/hevc".equals(this.f11015b)) {
                iIntValue = 2;
            }
            iIntValue2 = 0;
        }
        if (!this.f11021h && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrH = h();
        if (sv2.f15560a <= 23 && "video/x-vnd.on2.vp9".equals(this.f11015b) && codecProfileLevelArrH.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11017d;
            int iIntValue3 = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
            if (iIntValue3 >= 180000000) {
                i10 = 1024;
            } else if (iIntValue3 >= 120000000) {
                i10 = 512;
            } else if (iIntValue3 >= 60000000) {
                i10 = 256;
            } else if (iIntValue3 >= 30000000) {
                i10 = 128;
            } else if (iIntValue3 >= 18000000) {
                i10 = 64;
            } else if (iIntValue3 >= 12000000) {
                i10 = 32;
            } else if (iIntValue3 >= 7200000) {
                i10 = 16;
            } else if (iIntValue3 < 3600000) {
                i10 = iIntValue3 >= 1800000 ? 4 : iIntValue3 >= 800000 ? 2 : 1;
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i10;
            codecProfileLevelArrH = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArrH) {
            if (codecProfileLevel2.profile == iIntValue && (codecProfileLevel2.level >= iIntValue2 || !z10)) {
                if ("video/hevc".equals(this.f11015b) && iIntValue == 2) {
                    String str = sv2.f15561b;
                    if ("sailfish".equals(str) || "marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        j("codec.profileLevel, " + k9Var.f10895i + ", " + this.f11016c);
        return false;
    }

    private final boolean m(k9 k9Var) {
        return this.f11015b.equals(k9Var.f10898l) || this.f11015b.equals(eg4.e(k9Var));
    }

    public final Point a(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11017d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return i(videoCapabilities, i10, i11);
    }

    public final h54 b(k9 k9Var, k9 k9Var2) {
        int i10 = true != sv2.b(k9Var.f10898l, k9Var2.f10898l) ? 8 : 0;
        if (this.f11021h) {
            if (k9Var.f10906t != k9Var2.f10906t) {
                i10 |= 1024;
            }
            if (!this.f11018e && (k9Var.f10903q != k9Var2.f10903q || k9Var.f10904r != k9Var2.f10904r)) {
                i10 |= 512;
            }
            if (!sv2.b(k9Var.f10910x, k9Var2.f10910x)) {
                i10 |= 2048;
            }
            String str = this.f11014a;
            if (sv2.f15563d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !k9Var.d(k9Var2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new h54(this.f11014a, k9Var, k9Var2, true != k9Var.d(k9Var2) ? 2 : 3, 0);
            }
        } else {
            if (k9Var.f10911y != k9Var2.f10911y) {
                i10 |= 4096;
            }
            if (k9Var.f10912z != k9Var2.f10912z) {
                i10 |= 8192;
            }
            if (k9Var.A != k9Var2.A) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.f11015b)) {
                Pair pairB = eg4.b(k9Var);
                Pair pairB2 = eg4.b(k9Var2);
                if (pairB != null && pairB2 != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    int iIntValue2 = ((Integer) pairB2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new h54(this.f11014a, k9Var, k9Var2, 3, 0);
                    }
                }
            }
            if (!k9Var.d(k9Var2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.f11015b)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new h54(this.f11014a, k9Var, k9Var2, 1, 0);
            }
        }
        return new h54(this.f11014a, k9Var, k9Var2, 0, i10);
    }

    public final boolean d(k9 k9Var) {
        return m(k9Var) && l(k9Var, false);
    }

    public final boolean e(k9 k9Var) {
        String str;
        String str2;
        int i10;
        if (!m(k9Var) || !l(k9Var, true)) {
            return false;
        }
        if (this.f11021h) {
            int i11 = k9Var.f10903q;
            if (i11 <= 0 || (i10 = k9Var.f10904r) <= 0) {
                return true;
            }
            if (sv2.f15560a >= 21) {
                return g(i11, i10, k9Var.f10905s);
            }
            boolean z10 = i11 * i10 <= eg4.a();
            if (!z10) {
                j("legacyFrameSize, " + k9Var.f10903q + "x" + k9Var.f10904r);
            }
            return z10;
        }
        int i12 = sv2.f15560a;
        if (i12 >= 21) {
            int i13 = k9Var.f10912z;
            if (i13 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11017d;
                if (codecCapabilities == null) {
                    str2 = "sampleRate.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        str2 = "sampleRate.aCaps";
                    } else if (!audioCapabilities.isSampleRateSupported(i13)) {
                        str2 = "sampleRate.support, " + i13;
                    }
                }
                j(str2);
                return false;
            }
            int i14 = k9Var.f10911y;
            if (i14 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f11017d;
                if (codecCapabilities2 == null) {
                    str = "channelCount.caps";
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        str = "channelCount.aCaps";
                    } else {
                        String str3 = this.f11014a;
                        String str4 = this.f11015b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i12 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str4) && !"audio/3gpp".equals(str4) && !"audio/amr-wb".equals(str4) && !"audio/mp4a-latm".equals(str4) && !"audio/vorbis".equals(str4) && !"audio/opus".equals(str4) && !"audio/raw".equals(str4) && !"audio/flac".equals(str4) && !"audio/g711-alaw".equals(str4) && !"audio/g711-mlaw".equals(str4) && !"audio/gsm".equals(str4))) {
                            int i15 = "audio/ac3".equals(str4) ? 6 : "audio/eac3".equals(str4) ? 16 : 30;
                            ad2.e("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str3 + ", [" + maxInputChannelCount + " to " + i15 + "]");
                            maxInputChannelCount = i15;
                        }
                        if (maxInputChannelCount < i14) {
                            str = "channelCount.support, " + i14;
                        }
                    }
                }
                j(str);
                return false;
            }
        }
        return true;
    }

    public final boolean f(k9 k9Var) {
        if (this.f11021h) {
            return this.f11018e;
        }
        Pair pairB = eg4.b(k9Var);
        return pairB != null && ((Integer) pairB.first).intValue() == 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(int r8, int r9, double r10) {
        /*
            r7 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r7.f11017d
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r8 = "sizeAndRate.caps"
        L7:
            r7.j(r8)
            return r1
        Lb:
            android.media.MediaCodecInfo$VideoCapabilities r0 = r0.getVideoCapabilities()
            if (r0 != 0) goto L14
            java.lang.String r8 = "sizeAndRate.vCaps"
            goto L7
        L14:
            int r2 = com.google.android.gms.internal.ads.sv2.f15560a
            r3 = 29
            java.lang.String r4 = "@"
            java.lang.String r5 = "x"
            r6 = 1
            if (r2 < r3) goto L48
            int r2 = com.google.android.gms.internal.ads.jf4.a(r0, r8, r9, r10)
            r3 = 2
            if (r2 != r3) goto L27
            return r6
        L27:
            if (r2 == r6) goto L2a
            goto L48
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.cover, "
        L31:
            r0.append(r2)
            r0.append(r8)
            r0.append(r5)
            r0.append(r9)
            r0.append(r4)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            goto L7
        L48:
            boolean r2 = k(r0, r8, r9, r10)
            if (r2 != 0) goto Lc9
            if (r8 >= r9) goto Lc0
            java.lang.String r2 = r7.f11014a
            java.lang.String r3 = "OMX.MTK.VIDEO.DECODER.HEVC"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L64
            java.lang.String r2 = com.google.android.gms.internal.ads.sv2.f15561b
            java.lang.String r3 = "mcv5a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto Lc0
        L64:
            boolean r0 = k(r0, r9, r8, r10)
            if (r0 != 0) goto L6b
            goto Lc0
        L6b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "sizeAndRate.rotated, "
            r0.append(r1)
            r0.append(r8)
            r0.append(r5)
            r0.append(r9)
            r0.append(r4)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = r7.f11014a
            java.lang.String r10 = r7.f11015b
            java.lang.String r11 = com.google.android.gms.internal.ads.sv2.f15564e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "AssumedSupport ["
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "] ["
            r0.append(r8)
            r0.append(r9)
            java.lang.String r9 = ", "
            r0.append(r9)
            r0.append(r10)
            r0.append(r8)
            r0.append(r11)
            java.lang.String r8 = "]"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r9 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.ad2.a(r9, r8)
            goto Lc9
        Lc0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "sizeAndRate.support, "
            goto L31
        Lc9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.kf4.g(int, int, double):boolean");
    }

    public final MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f11017d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public final String toString() {
        return this.f11014a;
    }
}
