package com.meta.analytics.dsp.uinode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class HR {
    public static byte[] A05;
    public static String[] A06 = {"j9EfDvchdu1KqySqOAnBSG3JWHZdS12U", "q23SQ5AypNqS8oaKOX4z", "zGl30nZzPzoLIdVG6oXXe73jwI6SvYzS", "XO0PMOb8qpQh9emdWW7Vnqfuo5cp8yJy", "hg0Ynef21ksm7drJYvbGXc6C6VdsLqYq", "sq8Z8cDX36Rb5yN4ZHuInHWL1DTNPmF7", "lpBmIRRiri9NKyd9o68rlNPCbyzvIw2I", "eicGPlwUgu"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C0992Vh A00 = C0992Vh.A04;
    public final TreeSet<C0990Vf> A04 = new TreeSet<>();

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A06[6].charAt(21) != 'N') {
                throw new RuntimeException();
            }
            A06[6] = "ipIPz5SC6v0GmkIAozZhwN70MrudeMSU";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 100);
            i13++;
        }
    }

    public static void A02() {
        byte[] bArr = {-79, -9, -14, -6, -3, -10, -11, -65, -77, 7, 2, -77, 42, 61, 70, 57, 69, 65, 70, 63, -8, 71, 62, -8};
        String[] strArr = A06;
        if (strArr[4].charAt(2) != strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A06[5] = "8leR2nWms8A7PmFgrtQ6nLfJYqb68GHr";
        A05 = bArr;
    }

    static {
        A02();
    }

    public HR(int i10, String str) {
        this.A02 = i10;
        this.A03 = str;
    }

    public static HR A00(int i10, DataInputStream dataInputStream) throws IOException {
        HR hr = new HR(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i10 < 2) {
            long j10 = dataInputStream.readLong();
            HW hw = new HW();
            HV.A05(hw, j10);
            hr.A0F(hw);
        } else {
            hr.A00 = C0992Vh.A00(dataInputStream);
        }
        return hr;
    }

    public final int A03(int i10) {
        int result = this.A02;
        int i11 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i11 + result2;
        if (i10 < 2) {
            long jA00 = HV.A00(this.A00);
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j10, long j11) {
        C0990Vf c0990VfA06 = A06(j10);
        if (c0990VfA06.A01()) {
            return -Math.min(c0990VfA06.A02() ? Long.MAX_VALUE : c0990VfA06.A01, j11);
        }
        long j12 = j10 + j11;
        long jMax = c0990VfA06.A02 + c0990VfA06.A01;
        if (jMax < j12) {
            TreeSet<C0990Vf> treeSet = this.A04;
            if (A06[1].length() != 20) {
                throw new RuntimeException();
            }
            A06[1] = "RgZ5bXDLk5KqdLdfFSHI";
            for (C0990Vf c0990Vf : treeSet.tailSet(c0990VfA06, false)) {
                if (c0990Vf.A02 > jMax) {
                    break;
                }
                jMax = Math.max(jMax, c0990Vf.A02 + c0990Vf.A01);
                if (jMax >= j12) {
                    break;
                }
            }
        }
        return Math.min(jMax - j10, j11);
    }

    public final C0992Vh A05() {
        return this.A00;
    }

    public final C0990Vf A06(long j10) {
        C0990Vf c0990VfA01 = C0990Vf.A01(this.A03, j10);
        C0990Vf c0990VfFloor = this.A04.floor(c0990VfA01);
        if (c0990VfFloor != null && c0990VfFloor.A02 + c0990VfFloor.A01 > j10) {
            return c0990VfFloor;
        }
        TreeSet<C0990Vf> treeSet = this.A04;
        String[] strArr = A06;
        if (strArr[2].charAt(22) != strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A06[6] = "nd2bgBSeUAsM9albd5et6NmdTACtd3AP";
        C0990Vf lookupSpan = treeSet.ceiling(c0990VfA01);
        if (lookupSpan == null) {
            return C0990Vf.A02(this.A03, j10);
        }
        return C0990Vf.A03(this.A03, j10, lookupSpan.A02 - j10);
    }

    public final C0990Vf A07(C0990Vf c0990Vf) throws HI {
        AbstractC0629Ha.A04(this.A04.remove(c0990Vf));
        C0990Vf c0990VfA08 = c0990Vf.A08(this.A02);
        if (c0990Vf.A03.renameTo(c0990VfA08.A03)) {
            this.A04.add(c0990VfA08);
            return c0990VfA08;
        }
        throw new HI(A01(12, 12, 116) + c0990Vf.A03 + A01(8, 4, 47) + c0990VfA08.A03 + A01(0, 8, 45));
    }

    public final TreeSet<C0990Vf> A08() {
        return this.A04;
    }

    public final void A09(C0990Vf c0990Vf) {
        this.A04.add(c0990Vf);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z10) {
        this.A01 = z10;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(HO ho) {
        if (this.A04.remove(ho)) {
            ho.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(HW hw) {
        C0992Vh c0992Vh = this.A00;
        C0992Vh oldMetadata = this.A00.A08(hw);
        this.A00 = oldMetadata;
        return !oldMetadata.equals(c0992Vh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HR hr = (HR) obj;
        if (this.A02 == hr.A02 && this.A03.equals(hr.A03) && this.A04.equals(hr.A04) && this.A00.equals(hr.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i10 = result * 31;
        int result2 = this.A04.hashCode();
        return i10 + result2;
    }
}
