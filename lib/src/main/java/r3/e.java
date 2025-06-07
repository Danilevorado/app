package r3;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.ir;
import com.google.android.gms.internal.ads.uu;
import com.google.android.gms.internal.ads.ze0;
import d3.m;
import k3.t;
import k3.w;

/* loaded from: classes.dex */
public final class e extends FrameLayout {

    /* renamed from: m, reason: collision with root package name */
    private final FrameLayout f26565m;

    /* renamed from: n, reason: collision with root package name */
    private final uu f26566n;

    public e(Context context) {
        super(context);
        this.f26565m = d(context);
        this.f26566n = e();
    }

    private final FrameLayout d(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    private final uu e() {
        if (isInEditMode()) {
            return null;
        }
        return t.a().g(this.f26565m.getContext(), this, this.f26565m);
    }

    private final void f(String str, View view) {
        uu uuVar = this.f26566n;
        if (uuVar != null) {
            try {
                uuVar.T2(str, l4.b.p1(view));
            } catch (RemoteException e5) {
                ze0.e("Unable to call setAssetView on delegate", e5);
            }
        }
    }

    protected final View a(String str) {
        uu uuVar = this.f26566n;
        if (uuVar != null) {
            try {
                l4.a aVarX = uuVar.x(str);
                if (aVarX != null) {
                    return (View) l4.b.L0(aVarX);
                }
            } catch (RemoteException e5) {
                ze0.e("Unable to call getAssetView on delegate", e5);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f26565m);
    }

    final /* synthetic */ void b(m mVar) {
        uu uuVar = this.f26566n;
        if (uuVar == null) {
            return;
        }
        try {
            if (mVar == null) {
                uuVar.r3(null);
            } else {
                ze0.b("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e5) {
            ze0.e("Unable to call setMediaContent on delegate", e5);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f26565m;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    final /* synthetic */ void c(ImageView.ScaleType scaleType) {
        uu uuVar = this.f26566n;
        if (uuVar == null || scaleType == null) {
            return;
        }
        try {
            uuVar.I3(l4.b.p1(scaleType));
        } catch (RemoteException e5) {
            ze0.e("Unable to call setMediaViewImageScaleType on delegate", e5);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f26566n != null) {
            if (((Boolean) w.c().b(ir.J9)).booleanValue()) {
                try {
                    this.f26566n.d0(l4.b.p1(motionEvent));
                } catch (RemoteException e5) {
                    ze0.e("Unable to call handleTouchEvent on delegate", e5);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof b) {
            return (b) viewA;
        }
        if (viewA == null) {
            return null;
        }
        ze0.b("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        uu uuVar = this.f26566n;
        if (uuVar != null) {
            try {
                uuVar.b1(l4.b.p1(view), i10);
            } catch (RemoteException e5) {
                ze0.e("Unable to call onVisibilityChanged on delegate", e5);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        super.addView(this.f26565m);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f26565m == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        f("3011", aVar);
    }

    public final void setAdvertiserView(View view) {
        f("3005", view);
    }

    public final void setBodyView(View view) {
        f("3004", view);
    }

    public final void setCallToActionView(View view) {
        f("3002", view);
    }

    public final void setClickConfirmingView(View view) {
        uu uuVar = this.f26566n;
        if (uuVar != null) {
            try {
                uuVar.Q0(l4.b.p1(view));
            } catch (RemoteException e5) {
                ze0.e("Unable to call setClickConfirmingView on delegate", e5);
            }
        }
    }

    public final void setHeadlineView(View view) {
        f("3001", view);
    }

    public final void setIconView(View view) {
        f("3003", view);
    }

    public final void setImageView(View view) {
        f("3008", view);
    }

    public final void setMediaView(b bVar) {
        f("3010", bVar);
        if (bVar == null) {
            return;
        }
        bVar.a(new g(this));
        bVar.b(new h(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, l4.a] */
    public void setNativeAd(c cVar) {
        uu uuVar = this.f26566n;
        if (uuVar != 0) {
            try {
                uuVar.R4(cVar.d());
            } catch (RemoteException e5) {
                ze0.e("Unable to call setNativeAd on delegate", e5);
            }
        }
    }

    public final void setPriceView(View view) {
        f("3007", view);
    }

    public final void setStarRatingView(View view) {
        f("3009", view);
    }

    public final void setStoreView(View view) {
        f("3006", view);
    }
}
