package elements;


import primitives.Color;

/**
 * base class for all Lights, _intensity value, intentionally "package-friendly" due to performance
 * .
 *
 * @author Yosef Levran & Shmuel Segal
 */
public abstract class Light {

     Color _intensity;

    /**
     * Initialize Lights color intensity
     * @param c
     */
    public Light(Color c) {
        this._intensity = c;
    }

    /**
     * Gets the original Light intensity I<sub>0</sub>
     * @return Light intensity
     */
    public Color getIntensity(){return _intensity;}

    /**
     * Getter
     *
     * @return the intensity of the light
     */
    public java.awt.Color getIntensityAWT() {
        return _intensity.getColor();
    }

}
