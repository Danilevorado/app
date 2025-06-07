package com.meta.analytics.dsp.uinode;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.ads.redexgen.X.6x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03946x implements InterfaceC0638Hj, InterfaceC0896Ro {
    public static byte[] A0A;
    public static String[] A0B = {"5Oiv1GLvIq7zEHzIHOTPzi3kaYzi9CKu", "OYJ8Vha7o3AKqeq5fQgjy4YAYzCEKBrH", "4fHxCa0vWIAizdOtLSYViH6HX8wZM136", "7SeobKfCaIBp1RCtBr0PVzHsRPnznuT1", "fOxTiSwrZex6", "3vZIMeafrjOpHP1eiyT8MHuy7IIJRNdQ", "XI5vdZH0G6FndxBvW8fNBqRq2FpLqBJ1", "pJZH6qXQIaEu24ksEJ9XliOUqsc1pAkZ"};
    public final C04017f A00;
    public final InterfaceC04137w A01;
    public final RK A02;
    public final InterfaceC0897Rp A03;
    public final C0905Rx A04;
    public final InterfaceC0906Ry A05;
    public final String A06;
    public final Map<EnumC0892Rk, C0651Hw> A09 = new HashMap();
    public final Map<EnumC0892Rk, AnonymousClass74> A08 = new HashMap();
    public final List<S2> A07 = new ArrayList();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 17);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A04() throws Throwable {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        synchronized (this) {
            for (C0651Hw c0651Hw : this.A09.values()) {
                if (c0651Hw.A9C()) {
                    map.put(c0651Hw, S5.A04);
                } else {
                    map.put(c0651Hw, S5.A03);
                }
            }
            new AtomicReference();
            new AtomicReference();
            Iterator<AnonymousClass74> it = this.A08.values().iterator();
            while (it.hasNext()) {
                it.next();
                InterfaceC0891Rj interfaceC0891Rj = null;
                if (interfaceC0891Rj.A9C()) {
                    throw new NullPointerException(A01(349, 20, 91));
                }
            }
            Iterator<S2> it2 = this.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw new NullPointerException(A01(424, 22, 50));
            }
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        JSONObject jSONObjectA03 = A03(map, map2, map3, map4);
        String.format(Locale.US, A01(188, 33, 55), this.A06, jSONObjectA03.toString(2));
        this.A02.AE0(this.A06, (A01(327, 8, 88) + URLEncoder.encode(jSONObjectA03.toString())).getBytes(), new HY(this, atomicReference, atomicReference2, countDownLatch));
        while (countDownLatch.getCount() > 0) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
        synchronized (this) {
            if (atomicReference2.get() != null) {
                throw ((Throwable) atomicReference2.get());
            }
            Set<S1> setA02 = A02((JSONObject) atomicReference.get());
            HashMap map5 = new HashMap();
            HashMap map6 = new HashMap();
            Iterator<S1> it3 = setA02.iterator();
            while (it3.hasNext()) {
                it3.next().A3Z(map5, map6);
            }
            this.A03.A5k(A00((JSONObject) atomicReference.get()));
            Iterator<S2> it4 = this.A07.iterator();
            if (it4.hasNext()) {
                it4.next();
                throw new NullPointerException(A01(401, 23, 80));
            }
        }
    }

    public static void A05() {
        A0A = new byte[]{101, -82, -72, 101, -73, -86, -72, -71, -73, -82, -88, -71, -86, -87, 115, 101, -104, -80, -82, -75, -75, -82, -77, -84, 101, -72, -66, -77, -88, -48, -1, -1, -81, -8, -3, -81, -15, -16, -14, -6, -10, 1, -2, 4, -3, -13, -67, -54, -24, -11, -11, -10, -5, -89, -22, -7, -20, -24, -5, -20, -89, -6, -20, -7, -3, -20, -7, -89, -23, -4, -11, -21, -13, -20, -89, -2, -16, -5, -17, -89, -11, -10, -11, -76, -6, -20, -7, -3, -20, -7, -89, -10, -2, -11, -20, -21, -89, -23, -4, -11, -21, -13, -20, -89, -48, -53, -85, -56, -37, -56, -121, -41, -39, -42, -54, -52, -38, -38, -48, -43, -50, -121, -42, -41, -37, -48, -42, -43, -121, -49, -12, -4, -25, -14, -17, -22, -90, -8, -21, -20, -8, -21, -7, -18, -90, -6, -17, -13, -21, -64, -90, -85, -22, -79, -56, -38, -125, -42, -56, -43, -39, -56, -43, -112, -46, -38, -47, -56, -57, -125, -59, -40, -47, -57, -49, -56, -125, -58, -43, -56, -60, -41, -56, -57, -99, -125, -120, -42, -101, -63, -74, -85, -80, -70, -73, -74, -79, -62, -87, -68, -79, -73, -74, 104, -70, -83, -71, -67, -83, -69, -68, 104, -68, -73, 104, 109, -69, -126, 82, 109, -69, -88, -50, -61, -72, -67, -57, -60, -61, -66, -49, -74, -55, -66, -60, -61, 117, -57, -70, -56, -59, -60, -61, -56, -70, -113, 95, 122, -56, 114, -104, -115, -126, -121, -111, -114, -115, -120, -103, Byte.MIN_VALUE, -109, -120, -114, -115, 63, -111, -108, -115, 63, -123, Byte.MIN_VALUE, -120, -117, -124, -125, 90, 63, -123, -114, -111, -126, -120, -115, -122, 63, -120, -115, 63, 68, -125, 63, -110, -124, -126, -114, -115, -125, -110, -103, -84, -91, -101, -93, -100, -86, -107, -95, -96, -90, -105, -86, -90, -122, -125, -106, -125, -89, -86, -81, -88, -90, -77, -79, -77, -86, -81, -75, -39, -54, -30, -43, -40, -54, -51, -90, -45, -58, -57, -45, -58, -44, -55, -40, -53, -41, -37, -53, -39, -38, -34, -47, -35, -31, -43, -34, -47, -33, -65, -27, -38, -49, -83, -38, -48, -66, -47, -33, -47, -32, -60, -73, -59, -62, -63, -64, -59, -73, -19, -33, -20, -16, -33, -20, -55, -15, -24, -33, -34, -68, -17, -24, -34, -26, -33, -67, -20, -33, -37, -18, -33, -34, -44, -38, -49, -60, -55, -45, -48, -49, -54, -37, -62, -43, -54, -48, -49, -89, -54, -49, -54, -44, -55, -58, -59, -74, -68, -79, -90, -85, -75, -78, -79, -84, -67, -92, -73, -84, -78, -79, -106, -73, -92, -75, -73, -88, -89, -53, -72, -55, -66, -68, -53, -74, -55, -68, -67, -55, -68, -54, -65, -74, -54};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private synchronized void A08(Throwable th) {
        Iterator<S2> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            new HashMap();
            new HashMap();
            throw new NullPointerException(A01(401, 23, 80));
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.InterfaceC0638Hj
    public final synchronized InterfaceC0891Rj A4i(EnumC0892Rk enumC0892Rk) {
        if (enumC0892Rk.A02() != EnumC0894Rm.A03) {
            throw new IllegalArgumentException(A01(47, 59, 118));
        }
        if (this.A09.containsKey(enumC0892Rk)) {
            return this.A09.get(enumC0892Rk);
        }
        C0651Hw c0651Hw = new C0651Hw(enumC0892Rk);
        this.A09.put(enumC0892Rk, c0651Hw);
        Iterator<S2> it = this.A07.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NullPointerException(A01(377, 24, 105));
        }
        String.format(Locale.US, A01(153, 35, 82), enumC0892Rk);
        return c0651Hw;
    }

    static {
        A05();
    }

    public C03946x(C04017f c04017f, InterfaceC04137w interfaceC04137w, RK rk, String str, InterfaceC0906Ry interfaceC0906Ry, C0905Rx c0905Rx, InterfaceC0895Rn interfaceC0895Rn) {
        this.A00 = c04017f;
        this.A01 = interfaceC04137w;
        this.A02 = rk;
        this.A06 = str;
        this.A05 = interfaceC0906Ry;
        this.A04 = c0905Rx;
        this.A03 = interfaceC0895Rn.A4V(this);
    }

    public static int A00(JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getJSONObject(A01(335, 7, 80)).getInt(A01(446, 16, 70));
        if (i10 > 0) {
            return i10;
        }
        throw new JSONException(String.format(Locale.US, A01(129, 24, 117), Integer.valueOf(i10)));
    }

    private Set<S1> A02(JSONObject jSONObject) throws JSONException {
        HashSet hashSet = new HashSet();
        JSONObject jSONObject2 = jSONObject.getJSONObject(A01(369, 8, 65));
        JSONObject jSONObject3 = jSONObject.getJSONObject(A01(298, 7, 38));
        for (final C0651Hw c0651Hw : this.A09.values()) {
            switch (S0.A01[S6.A00(jSONObject2.getString(c0651Hw.A7A().A03())).ordinal()]) {
                case 1:
                    final JSONObject data = jSONObject3.getJSONObject(c0651Hw.A7A().A03()).getJSONObject(A01(312, 4, 17));
                    final JSONObject responseObject = jSONObject3.getJSONObject(c0651Hw.A7A().A03()).optJSONObject(A01(316, 11, 48));
                    hashSet.add(new HN(c0651Hw, data, responseObject) { // from class: com.facebook.ads.redexgen.X.70
                        public final JSONObject A00;
                        public final JSONObject A01;

                        {
                            S6 s62 = S6.A03;
                            this.A00 = data;
                            this.A01 = responseObject;
                        }

                        @Override // com.meta.analytics.dsp.uinode.HN, com.meta.analytics.dsp.uinode.S1
                        public final void A3Z(Map<InterfaceC0891Rj, S6> map, Map<SyncModifiableBundle, EnumC0901Rt> map2) {
                            super.A00.A03(this.A00, this.A01);
                            super.A3Z(map, map2);
                        }
                    });
                    break;
                case 2:
                    hashSet.add(new HN(c0651Hw) { // from class: com.facebook.ads.redexgen.X.6z
                        {
                            S6 s62 = S6.A04;
                        }
                    });
                    break;
                default:
                    throw new AssertionError();
            }
        }
        Iterator<AnonymousClass74> it = this.A08.values().iterator();
        while (it.hasNext()) {
            it.next();
            final AnonymousClass74 anonymousClass74 = null;
            switch (S0.A00[EnumC0901Rt.A00(jSONObject2.getString(anonymousClass74.A7A().A03())).ordinal()]) {
                case 1:
                    hashSet.add(new HT(anonymousClass74) { // from class: com.facebook.ads.redexgen.X.73
                        {
                            EnumC0901Rt enumC0901Rt = EnumC0901Rt.A04;
                        }
                    });
                    break;
                case 2:
                    hashSet.add(new HT(anonymousClass74) { // from class: com.facebook.ads.redexgen.X.6y
                        public static byte[] A00;

                        static {
                            A01();
                        }

                        public static String A00(int i10, int i11, int i12) {
                            byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                            for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                                bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 52);
                            }
                            return new String(bArrCopyOfRange);
                        }

                        public static void A01() {
                            A00 = new byte[]{19, 5, 20, 50, 5, 17, 21, 9, 18, 5, 19, 51, 25, 14, 3};
                        }

                        {
                            EnumC0901Rt enumC0901Rt = EnumC0901Rt.A05;
                        }

                        @Override // com.meta.analytics.dsp.uinode.HT, com.meta.analytics.dsp.uinode.S1
                        public final void A3Z(Map<InterfaceC0891Rj, S6> map, Map<SyncModifiableBundle, EnumC0901Rt> map2) {
                            throw new NullPointerException(A00(0, 15, 84));
                        }
                    });
                    break;
                default:
                    throw new AssertionError();
            }
        }
        return hashSet;
    }

    private JSONObject A03(Map<InterfaceC0891Rj, S5> map, Map<SyncModifiableBundle, EnumC0900Rs> map2, Map<SyncModifiableBundle, JSONObject> clientBundleData, Map<SyncModifiableBundle, JSONObject> clientBundleFingerprint) throws JSONException {
        String strA01;
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<InterfaceC0891Rj, S5> entry : map.entrySet()) {
            jSONObject.put(entry.getKey().A7A().A03(), entry.getValue().A02());
        }
        for (Map.Entry<SyncModifiableBundle, EnumC0900Rs> entry2 : map2.entrySet()) {
            entry2.getKey();
            InterfaceC0891Rj interfaceC0891Rj = null;
            jSONObject.put(interfaceC0891Rj.A7A().A03(), entry2.getValue().A02());
        }
        JSONObject jSONObject2 = new JSONObject();
        Iterator<Map.Entry<InterfaceC0891Rj, S5>> it = map.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            strA01 = A01(316, 11, 48);
            if (!zHasNext) {
                break;
            }
            Map.Entry<InterfaceC0891Rj, S5> next = it.next();
            if (next.getValue() == S5.A04) {
                JSONObject bundles = new JSONObject();
                InterfaceC0891Rj key = next.getKey();
                jSONObject2.put(key.A7A().A03(), bundles);
                if (next.getKey().A7A().A04()) {
                    JSONObject request = key.A75();
                    bundles.put(strA01, request);
                } else {
                    bundles.put(strA01, JSONObject.NULL);
                }
                jSONObject2.put(key.A7A().A03(), bundles);
            }
        }
        for (Map.Entry<SyncModifiableBundle, EnumC0900Rs> entry3 : map2.entrySet()) {
            JSONObject updateData = new JSONObject();
            InterfaceC0891Rj key2 = entry3.getKey();
            JSONObject request2 = clientBundleFingerprint.get(entry3.getKey());
            updateData.put(strA01, request2);
            if (entry3.getValue() == EnumC0900Rs.A05) {
                String strA012 = A01(312, 4, 17);
                JSONObject request3 = clientBundleData.get(key2);
                updateData.put(strA012, request3);
                jSONObject2.put(key2.A7A().A03(), updateData);
            } else {
                String strA03 = key2.A7A().A03();
                String[] strArr = A0B;
                if (strArr[1].charAt(20) == strArr[6].charAt(20)) {
                    throw new RuntimeException();
                }
                A0B[5] = "j6hI8A69HBwx3QyEu85lNgwu8aXeWQ7U";
                jSONObject2.put(strA03, updateData);
            }
        }
        JSONObject bundleData = new JSONObject();
        for (Map.Entry<String, String> entry4 : this.A05.A6x().entrySet()) {
            if (entry4.getValue() != null) {
                bundleData.put(entry4.getKey(), entry4.getValue());
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put(A01(342, 7, 85), jSONObject);
        jSONObject3.put(A01(298, 7, 38), jSONObject2);
        jSONObject3.put(A01(305, 7, 33), bundleData);
        return jSONObject3;
    }

    public static void A06(String str, AtomicReference<JSONObject> atomicReference, AtomicReference<Throwable> atomicReference2) {
        String.format(Locale.US, A01(221, 28, 68), str);
        try {
            atomicReference.set((JSONObject) new JSONTokener(str).nextValue());
        } catch (ClassCastException | JSONException e5) {
            atomicReference2.set(e5);
        }
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0638Hj, com.meta.analytics.dsp.uinode.InterfaceC04057l
    public final void A5m() {
        this.A03.A5l();
    }

    @Override // com.meta.analytics.dsp.uinode.InterfaceC0896Ro
    public final void AFP() {
        if (this.A01.A9F()) {
            String str = A01(106, 23, 86) + this.A01.A6i().A07() + A01(0, 29, 52);
            A08(new S4());
            return;
        }
        try {
            if (!C0662Ih.A1e(this.A00) || this.A00.A03().A94()) {
                A04();
                return;
            }
            throw new IllegalStateException(A01(29, 18, 126));
        } catch (Throwable th) {
            String.format(Locale.US, A01(249, 49, 14), Integer.valueOf(this.A04.A01()));
            A08(th);
            this.A03.A5k(this.A04.A01());
        }
    }
}
