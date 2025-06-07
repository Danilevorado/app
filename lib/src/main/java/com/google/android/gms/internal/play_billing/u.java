package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class u extends m {

    /* renamed from: s, reason: collision with root package name */
    static final m f19650s = new u(null, new Object[0], 0);

    /* renamed from: p, reason: collision with root package name */
    private final transient Object f19651p;

    /* renamed from: q, reason: collision with root package name */
    final transient Object[] f19652q;

    /* renamed from: r, reason: collision with root package name */
    private final transient int f19653r;

    private u(Object obj, Object[] objArr, int i10) {
        this.f19651p = obj;
        this.f19652q = objArr;
        this.f19653r = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static u g(int i10, Object[] objArr, l lVar) {
        short[] sArr;
        char c10;
        char c11;
        byte[] bArr;
        int i11 = i10;
        Object[] objArrCopyOf = objArr;
        if (i11 == 0) {
            return (u) f19650s;
        }
        Object obj = null;
        int i12 = 1;
        if (i11 == 1) {
            Object obj2 = objArrCopyOf[0];
            Objects.requireNonNull(obj2);
            Object obj3 = objArrCopyOf[1];
            Objects.requireNonNull(obj3);
            e.a(obj2, obj3);
            return new u(null, objArrCopyOf, 1);
        }
        b.b(i11, objArrCopyOf.length >> 1, "index");
        int iMax = Math.max(i11, 2);
        int i13 = 1073741824;
        if (iMax < 751619276) {
            int iHighestOneBit = Integer.highestOneBit(iMax - 1);
            i13 = iHighestOneBit + iHighestOneBit;
            while (i13 * 0.7d < iMax) {
                i13 += i13;
            }
        } else if (iMax >= 1073741824) {
            throw new IllegalArgumentException("collection too large");
        }
        if (i11 == 1) {
            Object obj4 = objArrCopyOf[0];
            Objects.requireNonNull(obj4);
            Object obj5 = objArrCopyOf[1];
            Objects.requireNonNull(obj5);
            e.a(obj4, obj5);
            i11 = 1;
            c10 = 1;
            c11 = 2;
        } else {
            int i14 = i13 - 1;
            char c12 = 65535;
            if (i13 <= 128) {
                byte[] bArr2 = new byte[i13];
                Arrays.fill(bArr2, (byte) -1);
                int i15 = 0;
                int i16 = 0;
                while (i15 < i11) {
                    int i17 = i16 + i16;
                    int i18 = i15 + i15;
                    Object obj6 = objArrCopyOf[i18];
                    Objects.requireNonNull(obj6);
                    Object obj7 = objArrCopyOf[i18 ^ i12];
                    Objects.requireNonNull(obj7);
                    e.a(obj6, obj7);
                    int iA = f.a(obj6.hashCode());
                    while (true) {
                        int i19 = iA & i14;
                        int i20 = bArr2[i19] & 255;
                        if (i20 == 255) {
                            bArr2[i19] = (byte) i17;
                            if (i16 < i15) {
                                objArrCopyOf[i17] = obj6;
                                objArrCopyOf[i17 ^ 1] = obj7;
                            }
                            i16++;
                        } else {
                            if (obj6.equals(objArrCopyOf[i20])) {
                                int i21 = i20 ^ 1;
                                Object obj8 = objArrCopyOf[i21];
                                Objects.requireNonNull(obj8);
                                k kVar = new k(obj6, obj7, obj8);
                                objArrCopyOf[i21] = obj7;
                                obj = kVar;
                                break;
                            }
                            iA = i19 + 1;
                        }
                    }
                    i15++;
                    i12 = 1;
                }
                if (i16 == i11) {
                    bArr = bArr2;
                } else {
                    bArr = new Object[]{bArr2, Integer.valueOf(i16), obj};
                    c11 = 2;
                    c10 = 1;
                    obj = bArr;
                }
            } else if (i13 <= 32768) {
                sArr = new short[i13];
                Arrays.fill(sArr, (short) -1);
                int i22 = 0;
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = i22 + i22;
                    int i25 = i23 + i23;
                    Object obj9 = objArrCopyOf[i25];
                    Objects.requireNonNull(obj9);
                    Object obj10 = objArrCopyOf[i25 ^ 1];
                    Objects.requireNonNull(obj10);
                    e.a(obj9, obj10);
                    int iA2 = f.a(obj9.hashCode());
                    while (true) {
                        int i26 = iA2 & i14;
                        char c13 = (char) sArr[i26];
                        if (c13 == 65535) {
                            sArr[i26] = (short) i24;
                            if (i22 < i23) {
                                objArrCopyOf[i24] = obj9;
                                objArrCopyOf[i24 ^ 1] = obj10;
                            }
                            i22++;
                        } else {
                            if (obj9.equals(objArrCopyOf[c13])) {
                                int i27 = c13 ^ 1;
                                Object obj11 = objArrCopyOf[i27];
                                Objects.requireNonNull(obj11);
                                k kVar2 = new k(obj9, obj10, obj11);
                                objArrCopyOf[i27] = obj10;
                                obj = kVar2;
                                break;
                            }
                            iA2 = i26 + 1;
                        }
                    }
                }
                if (i22 != i11) {
                    c11 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i22), obj};
                    c10 = 1;
                }
                bArr = sArr;
            } else {
                int i28 = 1;
                sArr = new int[i13];
                Arrays.fill((int[]) sArr, -1);
                int i29 = 0;
                int i30 = 0;
                while (i29 < i11) {
                    int i31 = i30 + i30;
                    int i32 = i29 + i29;
                    Object obj12 = objArrCopyOf[i32];
                    Objects.requireNonNull(obj12);
                    Object obj13 = objArrCopyOf[i32 ^ i28];
                    Objects.requireNonNull(obj13);
                    e.a(obj12, obj13);
                    int iA3 = f.a(obj12.hashCode());
                    while (true) {
                        int i33 = iA3 & i14;
                        ?? r15 = sArr[i33];
                        if (r15 == c12) {
                            sArr[i33] = i31;
                            if (i30 < i29) {
                                objArrCopyOf[i31] = obj12;
                                objArrCopyOf[i31 ^ 1] = obj13;
                            }
                            i30++;
                        } else {
                            if (obj12.equals(objArrCopyOf[r15])) {
                                int i34 = r15 ^ 1;
                                Object obj14 = objArrCopyOf[i34];
                                Objects.requireNonNull(obj14);
                                k kVar3 = new k(obj12, obj13, obj14);
                                objArrCopyOf[i34] = obj13;
                                obj = kVar3;
                                break;
                            }
                            iA3 = i33 + 1;
                            c12 = 65535;
                        }
                    }
                    i29++;
                    i28 = 1;
                    c12 = 65535;
                }
                if (i30 != i11) {
                    c10 = 1;
                    c11 = 2;
                    obj = new Object[]{sArr, Integer.valueOf(i30), obj};
                }
                bArr = sArr;
            }
            c11 = 2;
            c10 = 1;
            obj = bArr;
        }
        boolean z10 = obj instanceof Object[];
        Object obj15 = obj;
        if (z10) {
            Object[] objArr2 = (Object[]) obj;
            k kVar4 = (k) objArr2[c11];
            if (lVar == null) {
                throw kVar4.a();
            }
            lVar.f19569c = kVar4;
            Object obj16 = objArr2[0];
            int iIntValue = ((Integer) objArr2[c10]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            obj15 = obj16;
            i11 = iIntValue;
        }
        return new u(obj15, objArrCopyOf, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.m
    final g a() {
        return new t(this.f19652q, 1, this.f19653r);
    }

    @Override // com.google.android.gms.internal.play_billing.m
    final n d() {
        return new r(this, this.f19652q, 0, this.f19653r);
    }

    @Override // com.google.android.gms.internal.play_billing.m
    final n e() {
        return new s(this, new t(this.f19652q, 0, this.f19653r));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0003  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0003 A[EDGE_INSN: B:44:0x0003->B:4:0x0003 BREAK  A[LOOP:0: B:16:0x0038->B:22:0x004e], EDGE_INSN: B:46:0x0003->B:4:0x0003 BREAK  A[LOOP:1: B:26:0x0063->B:32:0x007a], EDGE_INSN: B:48:0x0003->B:4:0x0003 BREAK  A[LOOP:2: B:34:0x0089->B:43:0x00a0]] */
    @Override // com.google.android.gms.internal.play_billing.m, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9c
        L6:
            int r1 = r9.f19653r
            java.lang.Object[] r2 = r9.f19652q
            r3 = 1
            if (r1 != r3) goto L20
            r1 = 0
            r1 = r2[r1]
            java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.util.Objects.requireNonNull(r10)
            goto L9c
        L20:
            java.lang.Object r1 = r9.f19651p
            if (r1 != 0) goto L25
            goto L3
        L25:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L51
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.f.a(r1)
        L38:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L41
            goto L3
        L41:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L4e
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L4e:
            int r1 = r1 + 1
            goto L38
        L51:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7d
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.play_billing.f.a(r1)
        L63:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6d
            goto L3
        L6d:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7a
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9c
        L7a:
            int r1 = r1 + 1
            goto L63
        L7d:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.play_billing.f.a(r6)
        L89:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L90
            goto L3
        L90:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La0
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9c:
            if (r10 != 0) goto L9f
            return r0
        L9f:
            return r10
        La0:
            int r6 = r6 + 1
            goto L89
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.u.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f19653r;
    }
}
