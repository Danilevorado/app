package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class b extends c9 {

    /* renamed from: d, reason: collision with root package name */
    private String f19770d;

    /* renamed from: e, reason: collision with root package name */
    private Set f19771e;

    /* renamed from: f, reason: collision with root package name */
    private Map f19772f;

    /* renamed from: g, reason: collision with root package name */
    private Long f19773g;

    /* renamed from: h, reason: collision with root package name */
    private Long f19774h;

    b(n9 n9Var) {
        super(n9Var);
    }

    private final ca l(Integer num) {
        if (this.f19772f.containsKey(num)) {
            return (ca) this.f19772f.get(num);
        }
        ca caVar = new ca(this, this.f19770d, null);
        this.f19772f.put(num, caVar);
        return caVar;
    }

    private final boolean m(int i10, int i11) {
        ca caVar = (ca) this.f19772f.get(Integer.valueOf(i10));
        if (caVar == null) {
            return false;
        }
        return caVar.f19833d.get(i11);
    }

    @Override // com.google.android.gms.measurement.internal.c9
    protected final boolean j() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:393:0x0a59, code lost:
    
        r0 = r64.f20269a.b().u();
        r6 = com.google.android.gms.measurement.internal.s3.y(r64.f19770d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0a6d, code lost:
    
        if (r7.E() == false) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0a6f, code lost:
    
        r7 = java.lang.Integer.valueOf(r7.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0a78, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0a79, code lost:
    
        r0.c("Invalid property filter ID. appId, id", r6, java.lang.String.valueOf(r7));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0786 A[PHI: r0 r5 r22 r28 r29
  0x0786: PHI (r0v92 java.util.Map) = (r0v94 java.util.Map), (r0v101 java.util.Map) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r5v33 android.database.Cursor) = (r5v34 android.database.Cursor), (r5v36 android.database.Cursor) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r22v13 com.google.android.gms.measurement.internal.r) = (r22v14 com.google.android.gms.measurement.internal.r), (r22v18 com.google.android.gms.measurement.internal.r) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r28v7 java.lang.String) = (r28v8 java.lang.String), (r28v11 java.lang.String) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]
  0x0786: PHI (r29v8 java.lang.String) = (r29v9 java.lang.String), (r29v11 java.lang.String) binds: [B:295:0x07b6, B:279:0x0782] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x097c  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0 A[Catch: SQLiteException -> 0x0220, all -> 0x0b46, TRY_LEAVE, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:432:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01be A[Catch: SQLiteException -> 0x0220, all -> 0x0b46, TRY_ENTER, TryCatch #7 {SQLiteException -> 0x0220, blocks: (B:58:0x01aa, B:60:0x01b0, B:62:0x01be, B:63:0x01c3, B:64:0x01cd, B:65:0x01dd, B:67:0x01ec), top: B:432:0x01aa }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025c  */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.util.List k(java.lang.String r65, java.util.List r66, java.util.List r67, java.lang.Long r68, java.lang.Long r69) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.b.k(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
