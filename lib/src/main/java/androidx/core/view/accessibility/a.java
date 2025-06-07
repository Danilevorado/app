package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: m, reason: collision with root package name */
    private final int f2372m;

    /* renamed from: n, reason: collision with root package name */
    private final d f2373n;

    /* renamed from: o, reason: collision with root package name */
    private final int f2374o;

    public a(int i10, d dVar, int i11) {
        this.f2372m = i10;
        this.f2373n = dVar;
        this.f2374o = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2372m);
        this.f2373n.O(this.f2374o, bundle);
    }
}
