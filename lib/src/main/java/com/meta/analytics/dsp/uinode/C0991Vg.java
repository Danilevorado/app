package com.meta.analytics.dsp.uinode;

import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Vg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0991Vg implements HK {
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"PZs3vIZtp1syVhF", "iN5G7Jyo65HiG11v5U3JAI3rcjEJu9Fh", "jWadhCo9gqYR1xuZ5eOebDdRLwIuwzoe", "5aVgPmkb9WO9SFxkSTOlcah0CKuDVehn", "Qok3N", "7mg38N8lomez8u4EtBpwlNJo", "Crj8XVI7aaG6XCZYe", "vguL8XPuWTEOQDWRTomV5"};
    public static final HashSet<File> A09;
    public long A00;
    public boolean A01;
    public final InterfaceC0993Vi A02;
    public final HS A03;
    public final File A04;
    public final HashMap<String, ArrayList<HJ>> A05;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        String[] strArr = A08;
        if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
            throw new RuntimeException();
        }
        A08[3] = "N0vjWbyGqBS98Run3kOI6tTmnpu8bGoB";
        A07 = new byte[]{67, 108, 109, 118, 106, 103, 112, 34, 81, 107, 111, 114, 110, 103, 65, 99, 97, 106, 103, 34, 107, 108, 113, 118, 99, 108, 97, 103, 34, 119, 113, 103, 113, 34, 118, 106, 103, 34, 100, 109, 110, 102, 103, 112, 56, 34, 48, 10, 14, 19, 15, 6, 32, 2, 0, 11, 6, 121, 67, 71, 90, 70, 79, 105, 75, 73, 66, 79, 4, 67, 68, 67, 94, 67, 75, 70, 67, 80, 79, 2, 3, 96, 71, 92, 65, 90, 93, 84, 19, 90, 93, 87, 86, 75, 19, 85, 90, 95, 86, 19, 85, 82, 90, 95, 86, 87, 20, 22, 20, 31, 18, 19, 40, 20, 24, 25, 3, 18, 25, 3, 40, 30, 25, 19, 18, 15, 89, 18, 15, 30};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized void A4N(File file) throws HI {
        AbstractC0629Ha.A04(!this.A01);
        C0990Vf c0990VfA00 = C0990Vf.A00(file, this.A03);
        AbstractC0629Ha.A04(c0990VfA00 != null);
        HR hrA09 = this.A03.A09(c0990VfA00.A04);
        AbstractC0629Ha.A01(hrA09);
        AbstractC0629Ha.A04(hrA09.A0D());
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            long jA00 = HV.A00(hrA09.A05());
            if (jA00 != -1) {
                AbstractC0629Ha.A04(c0990VfA00.A02 + c0990VfA00.A01 <= jA00);
            }
            A0A(c0990VfA00);
            this.A03.A0G();
            notifyAll();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:638)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized NavigableSet<HO> A6H(String str) {
        HR hrA09;
        AbstractC0629Ha.A04(!this.A01);
        hrA09 = this.A03.A09(str);
        return (hrA09 == null || hrA09.A0C()) ? new TreeSet() : new TreeSet((Collection) hrA09.A08());
    }

    static {
        A06();
        A09 = new HashSet<>();
    }

    public C0991Vg(File file, InterfaceC0993Vi interfaceC0993Vi) {
        this(file, interfaceC0993Vi, null, false);
    }

    public C0991Vg(File file, InterfaceC0993Vi interfaceC0993Vi, HS hs) {
        if (A0D(file)) {
            this.A04 = file;
            this.A02 = interfaceC0993Vi;
            this.A03 = hs;
            this.A05 = new HashMap<>();
            ConditionVariable conditionVariable = new ConditionVariable();
            new HX(this, A03(57, 24, 112), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A03(0, 46, 88) + file);
    }

    public C0991Vg(File file, InterfaceC0993Vi interfaceC0993Vi, byte[] bArr, boolean z10) {
        this(file, interfaceC0993Vi, new HS(file, bArr, z10));
    }

    private C0990Vf A00(String str, long j10) throws IOException {
        C0990Vf span;
        HR hrA09 = this.A03.A09(str);
        if (hrA09 == null) {
            C0990Vf c0990VfA02 = C0990Vf.A02(str, j10);
            if (A08[7].length() == 15) {
                throw new RuntimeException();
            }
            A08[3] = "R7TEvDOiyk4OKBf9PsOT39P5pIR22NMD";
            return c0990VfA02;
        }
        while (true) {
            span = hrA09.A06(j10);
            if (!span.A05 || span.A03.exists()) {
                break;
            }
            A05();
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.HK
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final synchronized C0990Vf AGV(String str, long j10) throws HI, InterruptedException {
        C0990Vf span;
        while (true) {
            span = AGW(str, j10);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.meta.analytics.dsp.uinode.HK
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final synchronized C0990Vf AGW(String str, long j10) throws HI {
        AbstractC0629Ha.A04(!this.A01);
        C0990Vf c0990VfA00 = A00(str, j10);
        if (c0990VfA00.A05) {
            C0990Vf cacheSpan = this.A03.A09(str).A07(c0990VfA00);
            A0C(c0990VfA00, cacheSpan);
            return cacheSpan;
        }
        HR hrA0A = this.A03.A0A(str);
        if (hrA0A.A0D()) {
            return null;
        }
        hrA0A.A0B(true);
        return c0990VfA00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() throws IOException {
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            return;
        }
        this.A03.A0E();
        File[] fileArrListFiles = this.A04.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (!file.getName().equals(A03(106, 24, 45))) {
                C0990Vf c0990VfA00 = file.length() > 0 ? C0990Vf.A00(file, this.A03) : null;
                if (c0990VfA00 != null) {
                    A0A(c0990VfA00);
                } else {
                    file.delete();
                }
            }
        }
        this.A03.A0F();
        try {
            this.A03.A0G();
        } catch (HI e5) {
            Log.e(A03(46, 11, 57), A03(81, 25, 105), e5);
        }
    }

    private void A05() throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator<HR> it = this.A03.A0D().iterator();
        while (it.hasNext()) {
            Iterator<C0990Vf> it2 = it.next().A08().iterator();
            while (it2.hasNext()) {
                C0990Vf next = it2.next();
                if (!next.A03.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            A08((HO) arrayList.get(i10), false);
        }
        this.A03.A0F();
        this.A03.A0G();
    }

    private void A07(HO ho) {
        ArrayList<HJ> arrayList = this.A05.get(ho.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADC(this, ho);
            }
        }
        this.A02.ADC(this, ho);
    }

    private void A08(HO ho, boolean z10) throws HI {
        HR hrA09 = this.A03.A09(ho.A04);
        if (hrA09 == null || !hrA09.A0E(ho)) {
            return;
        }
        this.A00 -= ho.A01;
        if (z10) {
            try {
                this.A03.A0H(hrA09.A03);
                this.A03.A0G();
            } finally {
                A07(ho);
            }
        }
    }

    private void A0A(C0990Vf c0990Vf) {
        this.A03.A0A(c0990Vf.A04).A09(c0990Vf);
        this.A00 += c0990Vf.A01;
        A0B(c0990Vf);
    }

    private void A0B(C0990Vf c0990Vf) {
        ArrayList<HJ> arrayList = this.A05.get(c0990Vf.A04);
        if (arrayList != null) {
            for (int i10 = arrayList.size() - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADB(this, c0990Vf);
            }
        }
        this.A02.ADB(this, c0990Vf);
    }

    private void A0C(C0990Vf c0990Vf, HO ho) {
        ArrayList<HJ> arrayList = this.A05.get(c0990Vf.A04);
        if (arrayList != null) {
            int size = arrayList.size();
            String[] strArr = A08;
            if (strArr[1].charAt(16) != strArr[2].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[0] = "YjLi8Ea68WiaTq3";
            strArr2[4] = "ACi8R";
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.get(i10).ADD(this, c0990Vf, ho);
            }
        }
        this.A02.ADD(this, c0990Vf, ho);
    }

    public static synchronized boolean A0D(File file) {
        if (A06) {
            return true;
        }
        return A09.add(file.getAbsoluteFile());
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized void A3a(String str, HW hw) throws HI {
        AbstractC0629Ha.A04(!this.A01);
        this.A03.A0I(str, hw);
        this.A03.A0G();
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized long A6F() {
        AbstractC0629Ha.A04(!this.A01);
        return this.A00;
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized long A6G(String str, long j10, long j11) {
        HR cachedContent;
        AbstractC0629Ha.A04(!this.A01);
        cachedContent = this.A03.A09(str);
        return cachedContent != null ? cachedContent.A04(j10, j11) : -j11;
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized long A6W(String str) {
        return HV.A00(A6X(str));
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized HU A6X(String str) {
        AbstractC0629Ha.A04(!this.A01);
        return this.A03.A0B(str);
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized void AEZ(HO ho) {
        AbstractC0629Ha.A04(!this.A01);
        HR hrA09 = this.A03.A09(ho.A04);
        AbstractC0629Ha.A01(hrA09);
        AbstractC0629Ha.A04(hrA09.A0D());
        hrA09.A0B(false);
        this.A03.A0H(hrA09.A03);
        notifyAll();
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized void AF9(HO ho) throws HI {
        AbstractC0629Ha.A04(!this.A01);
        A08(ho, true);
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized void AFx(String str, long j10) throws HI {
        HW mutations = new HW();
        HV.A05(mutations, j10);
        A3a(str, mutations);
    }

    @Override // com.meta.analytics.dsp.uinode.HK
    public final synchronized File AGT(String str, long j10, long j11) throws HI {
        HR hrA09;
        AbstractC0629Ha.A04(!this.A01);
        hrA09 = this.A03.A09(str);
        AbstractC0629Ha.A01(hrA09);
        AbstractC0629Ha.A04(hrA09.A0D());
        if (!this.A04.exists()) {
            this.A04.mkdirs();
            A05();
        }
        this.A02.ADE(this, str, j10, j11);
        return C0990Vf.A04(this.A04, hrA09.A02, j10, System.currentTimeMillis());
    }
}
