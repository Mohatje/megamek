/**
 * MegaMek - Copyright (C) 2004,2005 Ben Mazur (bmazur@sev.org)
 * 
 *  This program is free software; you can redistribute it and/or modify it 
 *  under the terms of the GNU General Public License as published by the Free 
 *  Software Foundation; either version 2 of the License, or (at your option) 
 *  any later version.
 * 
 *  This program is distributed in the hope that it will be useful, but 
 *  WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY 
 *  or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License 
 *  for more details.
 */
/*
 * Created on Oct 20, 2004
 *
 */
package megamek.common.weapons.artillery;

import megamek.common.AmmoType;
import megamek.common.SimpleTechLevel;

/**
 * @author Sebastian Brocks
 */
public class ISCruiseMissile90 extends ArtilleryWeapon {

    /**
     * 
     */
    private static final long serialVersionUID = 5323886711682442495L;

    /**
     * 
     */
    public ISCruiseMissile90() {
        super();
        this.name = "Cruise Missile/90";
        this.setInternalName("ISCruiseMissile90");
        this.heat = 90;
        this.rackSize = 90;
        this.ammoType = AmmoType.T_CRUISE_MISSILE;
        this.shortRange = 1;
        this.mediumRange = 2;
        this.longRange = 120;
        this.extremeRange = 120; // No extreme range.
        this.tonnage = 100;
        this.criticals = 100;
        this.flags = flags.or(F_CRUISE_MISSILE);
        this.bv = 1530;
        this.cost = 1250000;
        rulesRefs = "284,TO";
        techAdvancement.setTechBase(TECH_BASE_IS)
            .setTechRating(RATING_E)
            .setAvailability(RATING_X, RATING_X, RATING_F, RATING_E)
            .setISAdvancement(3065, 3095, DATE_NONE, DATE_NONE, DATE_NONE)
            .setISApproximate(false, false, false,false, false)
            .setPrototypeFactions(F_FS)
            .setProductionFactions(F_FS).setStaticTechLevel(SimpleTechLevel.EXPERIMENTAL);
    }

}
