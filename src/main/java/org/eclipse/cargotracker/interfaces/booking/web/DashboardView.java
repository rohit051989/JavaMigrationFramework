package org.eclipse.cargotracker.interfaces.booking.web;


import java.io.Serializable;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import org.primefaces.model.dashboard.DashboardColumn;
import org.primefaces.model.dashboard.DashboardModel;
import org.primefaces.model.dashboard.DefaultDashboardColumn;
import org.primefaces.model.dashboard.DefaultDashboardModel;

@Named
@ViewScoped
public class DashboardView implements Serializable {


	private static final long serialVersionUID = 1L;

	private DashboardModel model;

	private String name = "TestDD";

	public String getName() {
		return name;
	}

	public DashboardView() {
		// Initialize the dashboard model
		this.model = new DefaultDashboardModel();
        DefaultDashboardColumn mainColumn = new DefaultDashboardColumn();

		mainColumn.addWidget("Routed");
		mainColumn.addWidget("NotRouted");
		mainColumn.addWidget("Claimed");

		this.model.addColumn(mainColumn);

	}

	public DashboardModel getModel() {
		return model;
	}

	public void setModel(DashboardModel model) {
		this.model = model;
	}

}
