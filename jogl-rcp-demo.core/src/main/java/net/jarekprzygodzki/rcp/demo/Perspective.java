package net.jarekprzygodzki.rcp.demo;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.IViewLayout;

public class Perspective implements IPerspectiveFactory {
	
	static final String PERSPECTIVE_ID = "net.jarekprzygodzki.rcp.demo.perspective"; //$NON-NLS-1$

	/*
	 * Puts the single JOGL view in the editor area.
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(IPageLayout page) {
		// editor area invisible to avoid empty editor frame below our view
		page.setEditorAreaVisible(false);
		page.setFixed(true);
		page.addStandaloneView(JOGLView.ID, 
				false, IPageLayout.TOP, 0.2f,
				IPageLayout.ID_EDITOR_AREA);
		IViewLayout view = page.getViewLayout(JOGLView.ID);
		view.setCloseable(false);
		view.setMoveable(false);
	}
}
