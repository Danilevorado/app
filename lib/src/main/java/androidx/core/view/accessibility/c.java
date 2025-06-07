package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public abstract class c {

    static class a {
        static boolean a(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0034c(bVar));
        }

        static boolean b(AccessibilityManager accessibilityManager, b bVar) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0034c(bVar));
        }
    }

    public interface b {
        void onTouchExplorationStateChanged(boolean z10);
    }

    /* renamed from: androidx.core.view.accessibility.c$c, reason: collision with other inner class name */
    private static final class AccessibilityManagerTouchExplorationStateChangeListenerC0034c implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final b f2375a;

        AccessibilityManagerTouchExplorationStateChangeListenerC0034c(b bVar) {
            this.f2375a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0034c) {
                return this.f2375a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0034c) obj).f2375a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2375a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            this.f2375a.onTouchExplorationStateChanged(z10);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, b bVar) {
        return a.a(accessibilityManager, bVar);
    }

    public static boolean b(AccessibilityManager accessibilityManager, b bVar) {
        return a.b(accessibilityManager, bVar);
    }
}
