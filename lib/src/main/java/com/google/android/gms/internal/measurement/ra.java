package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class ra extends pa {
    ra() {
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* synthetic */ int a(Object obj) {
        return ((qa) obj).a();
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* synthetic */ int b(Object obj) {
        return ((qa) obj).b();
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* synthetic */ Object c(Object obj) {
        return ((u8) obj).zzc;
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        qa qaVar = (qa) obj2;
        return qaVar.equals(qa.c()) ? obj : qa.d((qa) obj, qaVar);
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* synthetic */ Object e() {
        return qa.e();
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* bridge */ /* synthetic */ void f(Object obj, int i10, long j10) {
        ((qa) obj).h(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final void g(Object obj) {
        ((u8) obj).zzc.f();
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* synthetic */ void h(Object obj, Object obj2) {
        ((u8) obj).zzc = (qa) obj2;
    }

    @Override // com.google.android.gms.internal.measurement.pa
    final /* synthetic */ void i(Object obj, gb gbVar) {
        ((qa) obj).i(gbVar);
    }
}
