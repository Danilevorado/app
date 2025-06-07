package j3;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.fp2;
import com.google.android.gms.internal.ads.ze0;

/* loaded from: classes.dex */
final class m extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f24486a;

    m(s sVar) {
        this.f24486a = sVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        s sVar = this.f24486a;
        if (sVar.f24502s != null) {
            try {
                sVar.f24502s.y(fp2.d(1, null, null));
            } catch (RemoteException e5) {
                ze0.i("#007 Could not call remote method.", e5);
            }
        }
        s sVar2 = this.f24486a;
        if (sVar2.f24502s != null) {
            try {
                sVar2.f24502s.H(0);
            } catch (RemoteException e10) {
                ze0.i("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.f24486a.q())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            s sVar = this.f24486a;
            if (sVar.f24502s != null) {
                try {
                    sVar.f24502s.y(fp2.d(3, null, null));
                } catch (RemoteException e5) {
                    ze0.i("#007 Could not call remote method.", e5);
                }
            }
            s sVar2 = this.f24486a;
            if (sVar2.f24502s != null) {
                try {
                    sVar2.f24502s.H(3);
                } catch (RemoteException e10) {
                    ze0.i("#007 Could not call remote method.", e10);
                }
            }
            this.f24486a.L5(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            s sVar3 = this.f24486a;
            if (sVar3.f24502s != null) {
                try {
                    sVar3.f24502s.y(fp2.d(1, null, null));
                } catch (RemoteException e11) {
                    ze0.i("#007 Could not call remote method.", e11);
                }
            }
            s sVar4 = this.f24486a;
            if (sVar4.f24502s != null) {
                try {
                    sVar4.f24502s.H(0);
                } catch (RemoteException e12) {
                    ze0.i("#007 Could not call remote method.", e12);
                }
            }
            this.f24486a.L5(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            s sVar5 = this.f24486a;
            if (sVar5.f24502s != null) {
                try {
                    sVar5.f24502s.i();
                } catch (RemoteException e13) {
                    ze0.i("#007 Could not call remote method.", e13);
                }
            }
            this.f24486a.L5(this.f24486a.x(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        s sVar6 = this.f24486a;
        if (sVar6.f24502s != null) {
            try {
                sVar6.f24502s.d();
                this.f24486a.f24502s.g();
            } catch (RemoteException e14) {
                ze0.i("#007 Could not call remote method.", e14);
            }
        }
        s.U5(this.f24486a, s.R5(this.f24486a, str));
        return true;
    }
}
