package com.meta.analytics.dsp.uinode;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: assets/audience_network.dex */
public final class EJ implements Y6 {
    public static byte[] A0M;
    public static String[] A0N = {"m3Tqgcaf5Zwh2KVI4lshI8Y9OWjAyKiW", "grdEJ2UvF2rVdGgR2IFX1R9SZI3Oow9U", "adSXB2DteQqbyu8FZt3lmhGSn0N0giaq", "NRdDTd6ed3Jg0yXdfuAl28VADrUF9IBW", "O75rLRuL5gqpexSF7Nk4cqg8fxEEp65Y", "atjqzip57QIi0KmRPtssGorCsXfOnHh4", "4ftStqMBHRnBf64I9Tdbb6", "F7xqVaNkoKYb3tQw5W1HE7EtQtFRVx9Y"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C04449c A05;
    public C04639w A06;
    public C04649x A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final EI A0E;
    public final AF A0F;
    public final AG A0G;
    public final AbstractC0613Gj A0H;
    public final C0614Gk A0I;
    public final ArrayDeque<C04489g> A0J;
    public final CopyOnWriteArraySet<A0> A0K;
    public final Y5[] A0L;

    public static String A02(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0M, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 6);
            if (A0N[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "Q2Fud838jOFv6puDYoQ5JAWfmkdvAH2h";
            strArr[3] = "Px66e0ytNEnQno4fNGUkfPLcZSToOlLf";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{121, -76, -93, -42, -51, -82, -54, -65, -41, -61, -48, -89, -53, -50, -54, 116, -89, -98, Byte.MAX_VALUE, -101, -112, -88, -108, -95, 123, -104, -111, 94, 97, 93, 103, 93, 99, -125, -88, -93, -82, 90, -107, -88, -81, -88, -92, -74, -88, 99, -97, -101, 94, -103, -14, -28, -28, -22, -45, -18, -97, -24, -26, -19, -18, -15, -28, -29, -97, -31, -28, -30, -32, -12, -14, -28, -97, -32, -19, -97, -32, -29, -97, -24, -14, -97, -17, -21, -32, -8, -24, -19, -26};
    }

    static {
        A03();
    }

    public EJ(Y5[] y5Arr, AbstractC0613Gj abstractC0613Gj, InterfaceC04589r interfaceC04589r, InterfaceC0632Hd interfaceC0632Hd) {
        Log.i(A02(2, 13, 88), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 83) + A02(15, 18, 41) + A02(47, 3, 56) + IF.A04 + A02(46, 1, 60));
        AbstractC0629Ha.A04(y5Arr.length > 0);
        this.A0L = (Y5[]) AbstractC0629Ha.A01(y5Arr);
        this.A0H = (AbstractC0613Gj) AbstractC0629Ha.A01(abstractC0613Gj);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        C0614Gk c0614Gk = new C0614Gk(new AB[y5Arr.length], new InterfaceC0610Gg[y5Arr.length], null);
        this.A0I = c0614Gk;
        this.A0G = new AG();
        this.A0F = new AF();
        this.A07 = C04649x.A04;
        final Looper looperMyLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        Handler handler = new Handler(looperMyLooper) { // from class: com.facebook.ads.redexgen.X.9f
            public static String[] A01 = {"n8jOK4TugbxocxEe6zYdC2apb8QBw5B2", "exJ9q2BbStmAElE6QlD9JR4gSu8htBEk", "BGOnc", "fVxwFvnWrEIXSQGXaFTt487unfsGWTNS", "M8AH3IesIZMXIj5TZDcC18mK6a9vd0E5", "EIDq0z1OpkYiciQBrU8tJkkKsNLFcNAn", "GYYw65loVBDf2akXR1DT72AGTz3TCOWc", "b13Ux"};

            @Override // android.os.Handler
            public final void handleMessage(Message message) throws Throwable {
                if (KL.A02(this)) {
                    return;
                }
                try {
                    this.A00.A0A(message);
                } catch (Throwable th) {
                    if (A01[3].charAt(19) != 't') {
                        throw new RuntimeException();
                    }
                    A01[6] = "ke6EFi0zu2eoeRmOo8SEy2Wv36xrwBWP";
                    KL.A00(th, this);
                }
            }
        };
        this.A0C = handler;
        this.A06 = new C04639w(AH.A01, 0L, TrackGroupArray.A04, c0614Gk);
        this.A0J = new ArrayDeque<>();
        EI ei = new EI(y5Arr, abstractC0613Gj, c0614Gk, interfaceC04589r, this.A0A, this.A03, this.A0B, handler, this, interfaceC0632Hd);
        this.A0E = ei;
        this.A0D = new Handler(ei.A0w());
    }

    private long A00(long j10) {
        long jA01 = C9W.A01(j10);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return jA01 + positionMs;
        }
        return jA01;
    }

    private C04639w A01(boolean z10, boolean z11, int i10) {
        C0614Gk c0614Gk;
        if (z10) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6g();
            this.A00 = A07();
            this.A04 = A6d();
        }
        AH ah = z11 ? AH.A01 : this.A06.A03;
        if (A0N[1].charAt(17) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0N;
        strArr[0] = "HCeOoliCNtIhqJVVEoV7ODJTUFyfMCgc";
        strArr[3] = "jOBrxCepwz9IOjYxDZZOtd2HpuVunHZu";
        Object obj = z11 ? null : this.A06.A07;
        C0569Eo c0569Eo = this.A06.A04;
        long j10 = this.A06.A02;
        long j11 = this.A06.A01;
        TrackGroupArray trackGroupArray = z11 ? TrackGroupArray.A04 : this.A06.A05;
        if (z11) {
            c0614Gk = this.A0I;
        } else {
            c0614Gk = this.A06.A06;
        }
        return new C04639w(ah, obj, c0569Eo, j10, j11, i10, false, trackGroupArray, c0614Gk);
    }

    private void A04(C04639w c04639w, int i10, boolean z10, int i11) {
        int i12;
        C04639w c04639wA04 = c04639w;
        int i13 = this.A02 - i10;
        this.A02 = i13;
        if (i13 == 0) {
            if (c04639wA04.A02 == -9223372036854775807L) {
                c04639wA04 = c04639wA04.A04(c04639wA04.A04, 0L, c04639wA04.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && c04639wA04.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                this.A04 = 0L;
            }
            if (this.A08) {
                i12 = 0;
            } else {
                i12 = 2;
            }
            boolean z11 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c04639wA04, z10, i11, i12, z11, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(final C04639w c04639w, final boolean z10, final int i10, final int i11, final boolean z11, final boolean z12) {
        boolean isRunningRecursiveListenerNotification = !this.A0J.isEmpty();
        ArrayDeque<C04489g> arrayDeque = this.A0J;
        final C04639w c04639w2 = this.A06;
        final CopyOnWriteArraySet<A0> copyOnWriteArraySet = this.A0K;
        final AbstractC0613Gj abstractC0613Gj = this.A0H;
        final boolean z13 = this.A0A;
        arrayDeque.addLast(new Object(c04639w, c04639w2, copyOnWriteArraySet, abstractC0613Gj, z10, i10, i11, z11, z13, z12) { // from class: com.facebook.ads.redexgen.X.9g
            public static String[] A0C = {"ngVoBp5pr", "xJziJS8oS", "0Acs5KUpAntiIN9SBf", "RdvtHMhhQhD1iGhGKfpT4jwIcRZugl7b", "SwdEOGzegqYmuuXtqS3DnPJA1PQs60Y1", "mjJqNiV5uYYXT5JIaz2mCpImvyi2YwVT", "z", "dC4jFhBSvokHiCeDasSLAsgetwgdiZCj"};
            public final int A00;
            public final int A01;
            public final C04639w A02;
            public final AbstractC0613Gj A03;
            public final Set<A0> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = c04639w;
                this.A04 = copyOnWriteArraySet;
                this.A03 = abstractC0613Gj;
                this.A08 = z10;
                this.A00 = i10;
                this.A01 = i11;
                this.A09 = z11;
                this.A06 = z13;
                this.A07 = z12 || c04639w2.A00 != c04639w.A00;
                this.A0A = (c04639w2.A03 == c04639w.A03 && c04639w2.A07 == c04639w.A07) ? false : true;
                this.A05 = c04639w2.A08 != c04639w.A08;
                this.A0B = c04639w2.A06 != c04639w.A06;
            }

            public final void A00() {
                Iterator<A0> it;
                if (this.A0A || this.A01 == 0) {
                    Iterator<A0> it2 = this.A04.iterator();
                    while (it2.hasNext()) {
                        it2.next().ADJ(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (A0 listener : this.A04) {
                        listener.ACh(this.A00);
                    }
                }
                boolean z14 = this.A0B;
                String[] strArr = A0C;
                if (strArr[6].length() != strArr[2].length()) {
                    A0C[4] = "kVA7KUftqEYsKKgit7KobnVmlfmelHtP";
                    if (z14) {
                        this.A03.A0U(this.A02.A06.A02);
                        for (A0 a02 : this.A04) {
                            C04639w c04639w3 = this.A02;
                            String[] strArr2 = A0C;
                            if (strArr2[0].length() == strArr2[1].length()) {
                                String[] strArr3 = A0C;
                                strArr3[6] = "m";
                                strArr3[2] = "KqMQ2zUn9wEBuYOIrT";
                                a02.ADM(c04639w3.A05, this.A02.A06.A01);
                            }
                        }
                    }
                    boolean z15 = this.A05;
                    if (A0C[5].charAt(4) == 'F') {
                        throw new RuntimeException();
                    }
                    A0C[5] = "SUKzwd9m16qKT5RYTkUj9PT0NEqmu9kE";
                    if (z15) {
                        Iterator<A0> it3 = this.A04.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            if (A0C[4].charAt(10) == 'Y') {
                                String[] strArr4 = A0C;
                                strArr4[6] = "I";
                                strArr4[2] = "zdEQR0QEwobMnnP3YQ";
                                if (!zHasNext) {
                                    break;
                                }
                                A0 listener2 = it3.next();
                                listener2.AC7(this.A02.A08);
                            } else {
                                String[] strArr5 = A0C;
                                strArr5[0] = "7SswXZjoc";
                                strArr5[1] = "LaiVjvUVk";
                                if (!zHasNext) {
                                    break;
                                }
                                A0 listener22 = it3.next();
                                listener22.AC7(this.A02.A08);
                            }
                        }
                    }
                    if (this.A07) {
                        Set<A0> set = this.A04;
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() != strArr6[2].length()) {
                            A0C[5] = "xdr5mmXrWjbqVTrxDMPiLI1UYtBVMgU7";
                            it = set.iterator();
                        } else {
                            A0C[5] = "vgNSEPQsIWHaSH2OFiWclNn1gpDCsXwE";
                            it = set.iterator();
                        }
                        while (it.hasNext()) {
                            it.next().ACf(this.A06, this.A02.A00);
                        }
                    }
                    if (this.A09) {
                        Iterator<A0> it4 = this.A04.iterator();
                        while (it4.hasNext()) {
                            it4.next().AD4();
                        }
                        return;
                    }
                    return;
                }
                throw new RuntimeException();
            }
        });
        this.A06 = c04639w;
        if (isRunningRecursiveListenerNotification) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i10) {
        A09(i10, -9223372036854775807L);
    }

    public final void A09(int i10, long j10) {
        long jA00;
        AH ah = this.A06.A03;
        if (i10 < 0 || (!ah.A0E() && i10 >= ah.A01())) {
            throw new C04579q(ah, i10, j10);
        }
        this.A09 = true;
        this.A02++;
        boolean zA0B = A0B();
        String[] strArr = A0N;
        if (strArr[7].charAt(11) == strArr[2].charAt(11)) {
            String[] strArr2 = A0N;
            strArr2[0] = "5JrPhprFhX8le0yHjhtYDABd6qn7MJv2";
            strArr2[3] = "AcgEDj7anvk4CRi6YuD76A9KphiljDlH";
            if (zA0B) {
                Log.w(A02(2, 13, 88), A02(50, 39, 121));
                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                return;
            }
            this.A01 = i10;
            if (ah.A0E()) {
                this.A04 = j10 == -9223372036854775807L ? 0L : j10;
                this.A00 = 0;
            } else {
                if (j10 == -9223372036854775807L) {
                    AG ag = this.A0G;
                    String[] strArr3 = A0N;
                    if (strArr3[0].charAt(24) != strArr3[3].charAt(24)) {
                        A0N[5] = "nEFnc7B5wfhj7ivnhhzsBLpbkebEETny";
                        jA00 = ah.A0B(i10, ag).A01();
                    }
                } else {
                    jA00 = C9W.A00(j10);
                    if (A0N[5].charAt(0) == 'S') {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0N;
                    strArr4[0] = "wxFThwrlUUeaJzWEA8zt6g3O6WvT4NEY";
                    strArr4[3] = "Cn8KVFPYAIX7JaaKfRlHGvTkFrF10J5Z";
                }
                Pair<Integer, Long> pairA07 = ah.A07(this.A0G, this.A0F, i10, jA00);
                this.A04 = C9W.A01(jA00);
                this.A00 = ((Integer) pairA07.first).intValue();
            }
            this.A0E.A0y(ah, i10, C9W.A00(j10));
            Iterator<A0> it = this.A0K.iterator();
            while (it.hasNext()) {
                it.next().ACh(1);
            }
            return;
        }
        throw new RuntimeException();
    }

    public final void A0A(Message message) {
        switch (message.what) {
            case 0:
                A04((C04639w) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C04649x c04649x = (C04649x) message.obj;
                C04649x playbackParameters = this.A07;
                if (!playbackParameters.equals(c04649x)) {
                    this.A07 = c04649x;
                    Iterator<A0> it = this.A0K.iterator();
                    while (it.hasNext()) {
                        it.next().ACb(c04649x);
                    }
                    return;
                }
                return;
            case 2:
                C04449c c04449c = (C04449c) message.obj;
                this.A05 = c04449c;
                String[] strArr = A0N;
                if (strArr[0].charAt(24) == strArr[3].charAt(24)) {
                    throw new RuntimeException();
                }
                A0N[6] = "4yvjfA5Kw";
                Iterator<A0> it2 = this.A0K.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    if (A0N[6].length() == 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0N;
                    strArr2[0] = "M6bFWga7XOh4Nv4psw4qaL9KmcGoAikz";
                    strArr2[3] = "g5TiVjLanBSgFn2xszzFJfFzrFRrWctq";
                    if (zHasNext) {
                        it2.next().ACd(c04449c);
                    } else {
                        return;
                    }
                }
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final void A3Q(A0 a02) {
        this.A0K.add(a02);
    }

    @Override // com.meta.analytics.dsp.uinode.Y6
    public final A8 A4f(A7 a72) {
        return new A8(this.A0E, a72, this.A06.A03, A6g(), this.A0D);
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final int A6B() {
        long jA6C = A6C();
        long jA6q = A6q();
        if (jA6C == -9223372036854775807L || jA6q == -9223372036854775807L) {
            return 0;
        }
        if (jA6q == 0) {
            return 100;
        }
        return IF.A06((int) ((100 * jA6C) / jA6q), 0, 100);
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final long A6C() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final long A6Y() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            AF af = this.A0F;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[4] = "eLr0wKhVkEyrTiyBT4e5CdZ3SmFaaZ0Y";
            return af.A08() + C9W.A01(this.A06.A01);
        }
        return A6d();
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final int A6a() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final int A6b() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final long A6d() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final AH A6f() {
        return this.A06.A03;
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final int A6g() {
        if (A06()) {
            int i10 = this.A01;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[6] = "IPV6VHeKuNfhgMSHvhaXB";
            return i10;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final long A6q() {
        AH ah = this.A06.A03;
        if (ah.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            C0569Eo c0569Eo = this.A06.A04;
            ah.A09(c0569Eo.A02, this.A0F);
            return C9W.A01(this.A0F.A0A(c0569Eo.A00, c0569Eo.A01));
        }
        return ah.A0B(A6g(), this.A0G).A02();
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final boolean A7g() {
        return this.A0A;
    }

    @Override // com.meta.analytics.dsp.uinode.Y6
    public final void AE5(InterfaceC0571Eq interfaceC0571Eq, boolean z10, boolean z11) {
        this.A05 = null;
        C04639w c04639wA01 = A01(z10, z11, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(interfaceC0571Eq, z10, z11);
        A05(c04639wA01, false, 4, 1, false, false);
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final void AEV() {
        StringBuilder sbAppend = new StringBuilder().append(A02(38, 8, 61)).append(Integer.toHexString(System.identityHashCode(this))).append(A02(0, 2, 83)).append(A02(15, 18, 41));
        String strA02 = A02(47, 3, 56);
        Log.i(A02(2, 13, 88), sbAppend.append(strA02).append(IF.A04).append(strA02).append(C04549m.A00()).append(A02(46, 1, 60)).toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final void AFj(long j10) {
        A09(A6g(), j10);
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final void AFk() {
        A08(A6g());
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final void AG9(boolean z10) {
        if (this.A0A != z10) {
            this.A0A = z10;
            this.A0E.A10(z10);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.A5
    public final void AGa(boolean z10) {
        if (z10) {
            this.A05 = null;
        }
        C04639w c04639wA01 = A01(z10, z10, 1);
        this.A02++;
        this.A0E.A11(z10);
        A05(c04639wA01, false, 4, 1, false, false);
    }
}
