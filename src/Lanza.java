public class Lanza extends Arma{
    public Lanza(int nivel_rareza, int nivel, String nombre, double damage, double multiplicador, double distancia, double tiempo_para_damage) {
        super(nivel_rareza, nivel, nombre, damage, multiplicador, distancia, tiempo_para_damage);
        this.getMultiplicador();
        this.getDistancia();
        this.getTiempo_para_damage();
        this.doing_damage(damage);
    }

    @Override
    public double doing_damage(double distancia_enemigo) {
        return this.getMultiplicador()*this.getDamage()*(distancia_enemigo-this.getDistancia());
    }
}
