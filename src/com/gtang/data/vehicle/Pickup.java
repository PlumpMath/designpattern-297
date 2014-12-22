
package com.gtang.data.vehicle;

import com.gtang.data.engine.Engine;

public class Pickup extends AbstractVan {

    public Pickup (Engine engine) {

        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public Pickup (Engine engine, Vehicle.Colour colour) {

        super(engine, colour);
    }

	@Override
	public int getPrice() {
		return 11000;
	}

}
