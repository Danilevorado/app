package com.meta.analytics.dsp.uinode;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.Xy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1058Xy implements InterfaceC0481Ao {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"hUCCDXcY4t01difYD4QJmSlSRe7RVS9F", "yHOnf8lHgEM0FI0EKX1KbB3TaozNa", "kXByBOPR65DToxooqsu0gGt9HKAYl4Vo", "NIkyagP1AzDGImvyfrRhWneTEqqmK", "aXPRHAu0VDe5efXXlwPVbrYy41", "xYrm6yKJij65q9D2CisZETvgfz", "Fi2DTXQipqprJDEroL63LN5SWS4FAMqA", "8o6UBOAn3xAy4ZEKn0SjK2UR42QgxF0P"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
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
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    public AudioTrack A0N;
    public C04649x A0O;
    public C04649x A0P;
    public AT A0Q;
    public InterfaceC0479Am A0R;
    public ByteBuffer A0S;
    public ByteBuffer A0T;
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public InterfaceC0468Ab[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;
    public final AU A0g;
    public final C0487Au A0h;
    public final Y1 A0i;
    public final InterfaceC0490Ax A0j;
    public final C1052Xs A0k;
    public final ArrayDeque<C0492Az> A0l;
    public final boolean A0m;
    public final InterfaceC0468Ab[] A0n;
    public final InterfaceC0468Ab[] A0o;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private AudioTrack A0F(int i10) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i10);
    }

    public static String A0I(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0r, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{33, 45, 106, 98, 121, 45, 82, 102, 119, 122, 124, 71, 97, 114, 112, 120, 47, 2, 24, 8, 4, 5, 31, 2, 5, 30, 2, 31, 18, 75, 15, 14, 31, 14, 8, 31, 14, 15, 75, 48, 14, 19, 27, 14, 8, 31, 14, 15, 75, 33, 57, 38, 43, 38, 46, 78, 121, 111, 121, 104, 104, 117, 114, 123, 60, 111, 104, 125, 112, 112, 121, 120, 60, 125, 105, 120, 117, 115, 60, 104, 110, 125, Byte.MAX_VALUE, 119, 46, 21, 30, 3, 11, 30, 24, 15, 30, 31, 91, 26, 14, 31, 18, 20, 91, 30, 21, 24, 20, 31, 18, 21, 28, 65, 91, 58, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 79, 12, 7, 14, 1, 1, 10, 3, 79, 12, 0, 26, 1, 27, 85, 79, 24, 121, 112, 108, 107, 122, 109, 41, 58, 40, 58};
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01d4, code lost:
    
        if (r6 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d7, code lost:
    
        r4 = r10.A08;
        r2 = com.meta.analytics.dsp.uinode.C1058Xy.A0s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01ea, code lost:
    
        if (r2[2].charAt(5) == r2[7].charAt(5)) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01f1, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
    
        r2 = com.meta.analytics.dsp.uinode.C1058Xy.A0s;
        r2[4] = "14nowEFL6Yk6bTHhGEAerIHyFS";
        r2[5] = "whsLbLpoTkO7JKoY0ylMAK08jN";
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ff, code lost:
    
        if (r4 == 5) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0202, code lost:
    
        if (r4 != 6) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0204, code lost:
    
        r10.A02 = 20480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x020b, code lost:
    
        if (r4 != 7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x020d, code lost:
    
        r10.A02 = 49152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
    
        r10.A02 = 294912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0193, code lost:
    
        if (r6 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0195, code lost:
    
        r2 = android.media.AudioTrack.getMinBufferSize(r13, r5, r10.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019c, code lost:
    
        if (r2 == (-2)) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x019e, code lost:
    
        com.meta.analytics.dsp.uinode.AbstractC0629Ha.A04(r4);
        r10.A02 = com.meta.analytics.dsp.uinode.IF.A06(r2 * 4, ((int) A07(250000)) * r10.A09, (int) java.lang.Math.max(r2, A07(750000) * r10.A09));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01c6, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 18
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0148  */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4P(int r11, int r12, int r13, int r14, int[] r15, int r16, int r17) throws java.lang.IllegalStateException, com.meta.analytics.dsp.uinode.C0477Ak {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.analytics.dsp.uinode.C1058Xy.A4P(int, int, int, int, int[], int, int):void");
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public C1058Xy(AU au, InterfaceC0490Ax interfaceC0490Ax, boolean z10) {
        this.A0g = au;
        this.A0j = (InterfaceC0490Ax) AbstractC0629Ha.A01(interfaceC0490Ax);
        this.A0m = z10;
        this.A0f = new ConditionVariable(true);
        this.A0h = new C0487Au(new C1059Xz(this, null));
        Y1 y12 = new Y1();
        this.A0i = y12;
        C1052Xs c1052Xs = new C1052Xs();
        this.A0k = c1052Xs;
        ArrayList<AudioProcessor> toIntPcmAudioProcessors = new ArrayList<>();
        Collections.addAll(toIntPcmAudioProcessors, new C1055Xv(), y12, c1052Xs);
        Collections.addAll(toIntPcmAudioProcessors, interfaceC0490Ax.A64());
        this.A0o = (InterfaceC0468Ab[]) toIntPcmAudioProcessors.toArray(new InterfaceC0468Ab[toIntPcmAudioProcessors.size()]);
        this.A0n = new InterfaceC0468Ab[]{new C1057Xx()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = AT.A04;
        this.A01 = 0;
        this.A0P = C04649x.A04;
        this.A04 = -1;
        this.A0d = new InterfaceC0468Ab[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public C1058Xy(AU au, InterfaceC0468Ab[] interfaceC0468AbArr) {
        this(au, interfaceC0468AbArr, false);
    }

    public C1058Xy(AU au, InterfaceC0468Ab[] interfaceC0468AbArr, boolean z10) {
        this(au, new Y0(interfaceC0468AbArr), z10);
    }

    public static int A00(int i10, ByteBuffer byteBuffer) {
        if (i10 == 7 || i10 == 8) {
            return B1.A00(byteBuffer);
        }
        if (i10 == 5) {
            return AQ.A00();
        }
        if (i10 == 6) {
            int iA03 = AQ.A03(byteBuffer);
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "kQJQgIYBfsXVI0BXiDfXFh8Y0v";
            strArr2[5] = "xmKGBElaJ1P1UFLQWjzE2KvoVx";
            return iA03;
        }
        if (i10 == 14) {
            int iA02 = AQ.A02(byteBuffer);
            if (iA02 == -1) {
                return 0;
            }
            int syncframeOffset = AQ.A04(byteBuffer, iA02);
            return syncframeOffset * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 113) + i10);
    }

    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10) {
        return audioTrack.write(byteBuffer, i10, 1);
    }

    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i10, long j10) {
        if (this.A0S == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.A0S = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i10);
            this.A0S.putLong(8, 1000 * j10);
            this.A0S.position(0);
            this.A03 = i10;
        }
        int iRemaining = this.A0S.remaining();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "ZxHEhXNaRaOeicOuVS0y7eKtBmJV15x7";
        strArr2[0] = "lpmrRXkhPpBf5A8LovnLhyOg75mNhzFm";
        if (iRemaining > 0) {
            int avSyncHeaderBytesRemaining = audioTrack.write(this.A0S, iRemaining, 1);
            if (avSyncHeaderBytesRemaining < 0) {
                this.A03 = 0;
                return avSyncHeaderBytesRemaining;
            }
            if (avSyncHeaderBytesRemaining < iRemaining) {
                return 0;
            }
        }
        int iA01 = A01(audioTrack, byteBuffer, i10);
        if (iA01 < 0) {
            this.A03 = 0;
            String[] strArr3 = A0s;
            String str = strArr3[6];
            String str2 = strArr3[0];
            int iCharAt = str.charAt(5);
            int avSyncHeaderBytesRemaining2 = str2.charAt(5);
            if (iCharAt != avSyncHeaderBytesRemaining2) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0s;
            strArr4[6] = "98oBXXwj84JUUigMvdtlS6TYqH9EDAiG";
            strArr4[0] = "VyAxkX5UR8Pe4wLdxiezRSIVcQQDizsa";
            return iA01;
        }
        int avSyncHeaderBytesRemaining3 = this.A03;
        this.A03 = avSyncHeaderBytesRemaining3 - iA01;
        return iA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / this.A0B : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / this.A09 : this.A0K;
    }

    private long A05(long j10) {
        return A08(this.A0j.A80()) + j10;
    }

    private long A06(long j10) {
        C0492Az c0492Az = null;
        while (!this.A0l.isEmpty()) {
            C0492Az checkpoint = this.A0l.getFirst();
            if (j10 < checkpoint.A01) {
                break;
            }
            C0492Az c0492AzRemove = this.A0l.remove();
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "EqLX22Mle1kVg1sX5ZT6YkRLc5f35";
            strArr2[3] = "gdY2b1urbXezKivfsFNrjnMWNzK4t";
            c0492Az = c0492AzRemove;
        }
        if (c0492Az != null) {
            this.A0P = c0492Az.A02;
            this.A0G = c0492Az.A01;
            this.A0F = c0492Az.A00 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j10) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A7O(j10 - this.A0G);
        }
        return this.A0F + IF.A0C(j10 - this.A0G, this.A0P.A01);
    }

    private long A07(long j10) {
        return (this.A0A * j10) / 1000000;
    }

    private long A08(long j10) {
        return (1000000 * j10) / this.A0A;
    }

    private long A09(long j10) {
        return (1000000 * j10) / this.A06;
    }

    private AudioTrack A0D() {
        AudioAttributes audioAttributesA00;
        if (this.A0b) {
            audioAttributesA00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributesA00 = this.A0Q.A00();
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int audioSessionId = this.A01;
        if (audioSessionId == 0) {
            audioSessionId = 0;
        }
        return new AudioTrack(audioAttributesA00, audioFormatBuild, this.A02, 1, audioSessionId);
    }

    private AudioTrack A0E() throws C0478Al {
        AudioTrack audioTrack;
        if (IF.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int iA03 = IF.A03(this.A0Q.A03);
            int streamType = this.A01;
            if (streamType == 0) {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1, this.A01);
            }
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new C0478Al(state, this.A0A, this.A07, this.A02);
    }

    private void A0J() {
        int i10 = 0;
        while (true) {
            InterfaceC0468Ab[] interfaceC0468AbArr = this.A0d;
            int i11 = interfaceC0468AbArr.length;
            if (i10 < i11) {
                InterfaceC0468Ab interfaceC0468Ab = interfaceC0468AbArr[i10];
                interfaceC0468Ab.flush();
                this.A0e[i10] = interfaceC0468Ab.A7W();
                i10++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws C0478Al {
        C04649x c04649xA3b;
        this.A0f.block();
        AudioTrack audioTrackA0E = A0E();
        this.A0M = audioTrackA0E;
        int audioSessionId = audioTrackA0E.getAudioSessionId();
        if (A0p && IF.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        int audioSessionId3 = this.A01;
        if (audioSessionId3 != audioSessionId) {
            this.A01 = audioSessionId;
            InterfaceC0479Am interfaceC0479Am = this.A0R;
            if (interfaceC0479Am != null) {
                interfaceC0479Am.AAs(audioSessionId);
            }
        }
        if (this.A0V) {
            c04649xA3b = this.A0j.A3b(this.A0P);
        } else {
            c04649xA3b = C04649x.A04;
        }
        this.A0P = c04649xA3b;
        A0N();
        C0487Au c0487Au = this.A0h;
        AudioTrack audioTrack2 = this.A0M;
        int i10 = this.A08;
        int i11 = this.A09;
        int audioSessionId4 = this.A02;
        c0487Au.A0G(audioTrack2, i10, i11, audioSessionId4);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new C0489Aw(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (IF.A02 >= 21) {
            A0Q(this.A0M, this.A00);
            return;
        }
        AudioTrack audioTrack = this.A0M;
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[2] = "RUPACOvpiKp7bcWaTWyqVFSR7GtEantX";
        strArr2[7] = "RzQzoOWLdvYkkdkBCtRhC7yU7hWBsadG";
        A0R(audioTrack, this.A00);
    }

    private void A0N() {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0468Ab interfaceC0468Ab : A0V()) {
            if (interfaceC0468Ab.A8w()) {
                arrayList.add(interfaceC0468Ab);
            } else {
                interfaceC0468Ab.flush();
            }
        }
        int count = arrayList.size();
        this.A0d = (InterfaceC0468Ab[]) arrayList.toArray(new InterfaceC0468Ab[count]);
        this.A0e = new ByteBuffer[count];
        A0J();
    }

    private void A0P(long j10) throws C0480An {
        ByteBuffer input;
        int length = this.A0d.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                int count = i10 - 1;
                input = this.A0e[count];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = InterfaceC0468Ab.A00;
                }
            }
            if (i10 == length) {
                A0S(input, j10);
            } else {
                InterfaceC0468Ab interfaceC0468Ab = this.A0d[i10];
                interfaceC0468Ab.AEF(input);
                ByteBuffer byteBufferA7W = interfaceC0468Ab.A7W();
                this.A0e[i10] = byteBufferA7W;
                if (byteBufferA7W.hasRemaining()) {
                    i10++;
                }
            }
            boolean zHasRemaining = input.hasRemaining();
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[5];
            int index = str.length();
            int count2 = str2.length();
            if (index != count2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "GvJ2yOfBgit1iG3ukbpo3ztMvZtxyKui";
            strArr2[7] = "YNNwMOgGE9szKpvyLkHk1WmQlE5xjnt7";
            if (zHasRemaining) {
                return;
            } else {
                i10--;
            }
        }
    }

    public static void A0Q(AudioTrack audioTrack, float f5) {
        audioTrack.setVolume(f5);
    }

    public static void A0R(AudioTrack audioTrack, float f5) {
        audioTrack.setStereoVolume(f5, f5);
    }

    private void A0S(ByteBuffer byteBuffer, long j10) throws C0480An {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.A0U;
        String[] strArr = A0s;
        if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[1] = "Y8Mrx0I9TdYWTjTrSbpDFDKjoXuQO";
        strArr2[3] = "wRs1O0frPXGaUer72uaPv4p6RCTih";
        if (byteBuffer2 != null) {
            AbstractC0629Ha.A03(byteBuffer2 == byteBuffer);
        } else {
            this.A0U = byteBuffer;
            if (IF.A02 < 21) {
                int bytesWritten = byteBuffer.remaining();
                byte[] bArr = this.A0c;
                if (bArr == null || bArr.length < bytesWritten) {
                    this.A0c = new byte[bytesWritten];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, bytesWritten);
                byteBuffer.position(iPosition);
                this.A0C = 0;
            }
        }
        int iRemaining = byteBuffer.remaining();
        int iA01 = 0;
        if (IF.A02 < 21) {
            int iA0B = this.A0h.A0B(this.A0L);
            if (iA0B > 0) {
                iA01 = this.A0M.write(this.A0c, this.A0C, Math.min(iRemaining, iA0B));
                if (iA01 > 0) {
                    this.A0C += iA01;
                    byteBuffer.position(byteBuffer.position() + iA01);
                }
            }
        } else if (!this.A0b) {
            iA01 = A01(this.A0M, byteBuffer, iRemaining);
        } else {
            AbstractC0629Ha.A04(j10 != -9223372036854775807L);
            iA01 = A02(this.A0M, byteBuffer, iRemaining, j10);
        }
        this.A0E = SystemClock.elapsedRealtime();
        if (iA01 >= 0) {
            boolean z10 = this.A0X;
            if (z10) {
                this.A0L += iA01;
            }
            if (iA01 == iRemaining) {
                if (!z10) {
                    this.A0K += this.A05;
                }
                this.A0U = null;
                return;
            }
            return;
        }
        throw new C0480An(iA01);
    }

    private boolean A0T() throws C0480An {
        boolean z10 = false;
        if (this.A04 == -1) {
            boolean audioProcessorNeedsEndOfStream = this.A0Z;
            this.A04 = audioProcessorNeedsEndOfStream ? 0 : this.A0d.length;
            z10 = true;
        }
        while (true) {
            int i10 = this.A04;
            InterfaceC0468Ab[] interfaceC0468AbArr = this.A0d;
            if (i10 < interfaceC0468AbArr.length) {
                InterfaceC0468Ab interfaceC0468Ab = interfaceC0468AbArr[i10];
                if (z10) {
                    interfaceC0468Ab.AEE();
                }
                A0P(-9223372036854775807L);
                boolean audioProcessorNeedsEndOfStream2 = interfaceC0468Ab.A91();
                if (!audioProcessorNeedsEndOfStream2) {
                    return false;
                }
                z10 = true;
                this.A04++;
            } else {
                ByteBuffer byteBuffer = this.A0U;
                if (byteBuffer != null) {
                    A0S(byteBuffer, -9223372036854775807L);
                    if (this.A0U != null) {
                        return false;
                    }
                }
                this.A04 = -1;
                return true;
            }
        }
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private InterfaceC0468Ab[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void A59() throws IllegalStateException {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void A5W(int i10) throws IllegalStateException {
        AbstractC0629Ha.A04(IF.A02 >= 21);
        if (this.A0b) {
            int i11 = this.A01;
            String[] strArr = A0s;
            if (strArr[1].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "PS7IBOM7NZDOoVGPPjdQOv1dv3IkizxK";
            strArr2[7] = "jjqtzOvKeeqNL4elNx3MZRV4owozeHXU";
            if (i11 == i10) {
                return;
            }
        }
        this.A0b = true;
        this.A01 = i10;
        reset();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final long A6e(boolean z10) {
        if (!A0U() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        long jA0C = this.A0h.A0C(z10);
        long positionUs = A04();
        return this.A0H + A05(A06(Math.min(jA0C, A08(positionUs))));
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final C04649x A7h() {
        return this.A0P;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final boolean A8R(ByteBuffer byteBuffer, long j10) throws IllegalStateException, C0478Al, C0480An {
        ByteBuffer byteBuffer2 = this.A0T;
        AbstractC0629Ha.A03(byteBuffer2 == null || byteBuffer == byteBuffer2);
        boolean zA0U = A0U();
        String[] strArr = A0s;
        if (strArr[4].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "RcCB0XsFwDDOAw3euoH2B524NJP5PtQP";
        strArr2[0] = "S6sRDXDIUBrBns4w0IFsbKHJgfJaiswv";
        if (!zA0U) {
            A0K();
            if (this.A0Y) {
                AE2();
            }
        }
        if (!this.A0h.A0L(A04())) {
            return false;
        }
        ByteBuffer byteBuffer3 = this.A0T;
        String strA0I = A0I(6, 10, 25);
        if (byteBuffer3 == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.A0X && this.A05 == 0) {
                int iA00 = A00(this.A08, byteBuffer);
                this.A05 = iA00;
                if (iA00 == 0) {
                    return true;
                }
            }
            if (this.A0O != null) {
                if (!A0T()) {
                    return false;
                }
                C04649x c04649x = this.A0O;
                this.A0O = null;
                this.A0l.add(new C0492Az(this.A0j.A3b(c04649x), Math.max(0L, j10), A08(A04()), null));
                A0N();
            }
            if (this.A0D == 0) {
                this.A0H = Math.max(0L, j10);
                this.A0D = 1;
            } else {
                long expectedPresentationTimeUs = this.A0H + A09(A03());
                if (this.A0D == 1 && Math.abs(expectedPresentationTimeUs - j10) > 200000) {
                    Log.e(strA0I, A0I(16, 33, 97) + expectedPresentationTimeUs + A0I(0, 6, 7) + j10 + A0I(138, 1, 79));
                    this.A0D = 2;
                }
                if (this.A0D == 2) {
                    this.A0H += j10 - expectedPresentationTimeUs;
                    this.A0D = 1;
                    InterfaceC0479Am interfaceC0479Am = this.A0R;
                    if (interfaceC0479Am != null) {
                        interfaceC0479Am.ACg();
                    }
                }
            }
            if (this.A0X) {
                this.A0J += byteBuffer.remaining();
            } else {
                this.A0I += this.A05;
            }
            this.A0T = byteBuffer;
        }
        if (!this.A0Z) {
            A0S(this.A0T, j10);
        } else {
            A0P(j10);
        }
        if (!this.A0T.hasRemaining()) {
            this.A0T = null;
            return true;
        }
        if (this.A0h.A0K(A04())) {
            Log.w(strA0I, A0I(55, 29, 22));
            reset();
            return true;
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void A8U() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final boolean A8Z() {
        if (A0U()) {
            boolean zA0J = this.A0h.A0J(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "9qaAbWK7Rz0EURQ8gVPoKZJ79p";
            strArr2[5] = "PQsLZF4zdgMsSCMdKk30KO6aPE";
            if (zA0J) {
                return true;
            }
        }
        return false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final boolean A90(int i10) {
        if (IF.A0c(i10)) {
            return i10 != 4 || IF.A02 >= 21;
        }
        AU au = this.A0g;
        return au != null && au.A04(i10);
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final boolean A91() {
        return !A0U() || (this.A0W && !A8Z());
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void AE2() throws IllegalStateException {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            this.A0M.play();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void AE3() throws IllegalStateException, C0480An {
        if (!this.A0W && A0U() && A0T()) {
            this.A0h.A0F(A04());
            String[] strArr = A0s;
            if (strArr[4].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[1] = "3Beu4rQqJml6K6p71ugtSnl6z4kve";
            strArr2[3] = "vTiWK9GhFZyDb3TQGI4eNztci47gx";
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void AEV() throws IllegalStateException {
        reset();
        A0L();
        for (InterfaceC0468Ab interfaceC0468Ab : this.A0o) {
            interfaceC0468Ab.reset();
        }
        for (InterfaceC0468Ab interfaceC0468Ab2 : this.A0n) {
            interfaceC0468Ab2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void AFs(AT at) throws IllegalStateException {
        if (this.A0Q.equals(at)) {
            return;
        }
        this.A0Q = at;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void AG4(InterfaceC0479Am interfaceC0479Am) {
        this.A0R = interfaceC0479Am;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final C04649x AGA(C04649x c04649x) {
        if (A0U() && !this.A0V) {
            C04649x c04649x2 = C04649x.A04;
            this.A0P = c04649x2;
            return c04649x2;
        }
        C04649x c04649x3 = this.A0O;
        String[] strArr = A0s;
        if (strArr[6].charAt(5) != strArr[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[1] = "qknQOXr2sfI1wZbS1fFTxKCHwtwOF";
        strArr2[3] = "6hx8Cx11JAWA8IEiphxLzKnZtiWJj";
        if (c04649x3 == null) {
            if (!this.A0l.isEmpty()) {
                c04649x3 = this.A0l.getLast().A02;
            } else {
                c04649x3 = this.A0P;
            }
        }
        boolean zEquals = c04649x.equals(c04649x3);
        String[] strArr3 = A0s;
        if (strArr3[6].charAt(5) != strArr3[0].charAt(5)) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0s;
        strArr4[4] = "rapNwYGl5aH6wSWwsREtxqAYY9";
        strArr4[5] = "Swk5nrnVyktI66zCHmEiilSuas";
        if (!zEquals) {
            if (A0U()) {
                this.A0O = c04649x;
            } else {
                C04649x lastSetPlaybackParameters = this.A0j.A3b(c04649x);
                this.A0P = lastSetPlaybackParameters;
            }
        }
        C04649x lastSetPlaybackParameters2 = this.A0P;
        return lastSetPlaybackParameters2;
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void pause() throws IllegalStateException {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            AudioTrack audioTrack = this.A0M;
            String[] strArr = A0s;
            if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[2] = "3LzsBOqgGe30i16a9NIVlDJcub4Z4Vvr";
            strArr2[7] = "hMaFPO8QBdBmzyeIOXtEGbbLXROtxATQ";
            audioTrack.pause();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void reset() throws IllegalStateException {
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C04649x c04649x = this.A0O;
            if (c04649x != null) {
                this.A0P = c04649x;
                String[] strArr = A0s;
                if (strArr[2].charAt(5) != strArr[7].charAt(5)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[1] = "rnKZk3c8Taby0V4iUj7wGFJub43iz";
                strArr2[3] = "VEk4k7rPnS3kvq1QwagsAStWXQ6pG";
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                this.A0P = this.A0l.getLast().A02;
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0H()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new C0488Av(this, audioTrack).start();
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0481Ao
    public final void setVolume(float f5) {
        if (this.A00 != f5) {
            this.A00 = f5;
            A0M();
        }
    }
}
