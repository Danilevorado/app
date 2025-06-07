package com.bumptech.glide;

/* loaded from: classes.dex */
public abstract class l implements Cloneable {

    /* renamed from: m, reason: collision with root package name */
    private l2.c f5411m = l2.a.b();

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l clone() {
        try {
            return (l) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    final l2.c b() {
        return this.f5411m;
    }
}
