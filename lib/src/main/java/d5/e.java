package d5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private long f22939a;

    /* renamed from: b, reason: collision with root package name */
    private long f22940b;

    /* renamed from: c, reason: collision with root package name */
    private TimeInterpolator f22941c;

    /* renamed from: d, reason: collision with root package name */
    private int f22942d;

    /* renamed from: e, reason: collision with root package name */
    private int f22943e;

    public e(long j10, long j11) {
        this.f22941c = null;
        this.f22942d = 0;
        this.f22943e = 1;
        this.f22939a = j10;
        this.f22940b = j11;
    }

    public e(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f22942d = 0;
        this.f22943e = 1;
        this.f22939a = j10;
        this.f22940b = j11;
        this.f22941c = timeInterpolator;
    }

    static e b(ValueAnimator valueAnimator) {
        e eVar = new e(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        eVar.f22942d = valueAnimator.getRepeatCount();
        eVar.f22943e = valueAnimator.getRepeatMode();
        return eVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f22932b : interpolator instanceof AccelerateInterpolator ? a.f22933c : interpolator instanceof DecelerateInterpolator ? a.f22934d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f22939a;
    }

    public long d() {
        return this.f22940b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f22941c;
        return timeInterpolator != null ? timeInterpolator : a.f22932b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (c() == eVar.c() && d() == eVar.d() && g() == eVar.g() && h() == eVar.h()) {
            return e().getClass().equals(eVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f22942d;
    }

    public int h() {
        return this.f22943e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
