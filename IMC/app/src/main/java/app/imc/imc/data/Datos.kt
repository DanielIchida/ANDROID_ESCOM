package app.imc.imc.data

import app.imc.imc.R

data class Imc(val indicador: String , val imc: String , val icono: Int)

fun listadoClasificacion(): ArrayList<Imc>{
    val listado = ArrayList<Imc>()
    listado.add(Imc("<16.00","Infrapeso: Delgadez Severa",R.drawable.ic_error))
    listado.add(Imc("16.00 - 16.99","Infrapeso: Delgadez Moderada",R.drawable.ic_neutral))
    listado.add(Imc("17.00 - 18.49","Infrapeso: Delgadez Aceptable",R.drawable.ic_neutral))
    listado.add(Imc("18.50 - 24.99","Peso normal",R.drawable.ic_ok))
    listado.add(Imc("25.00 - 29.99","Sobrepeso",R.drawable.ic_neutral))
    listado.add(Imc("30.00 - 34.99","Obeso: Tipo I",R.drawable.ic_error))
    listado.add(Imc("35.00 - 40.00","Obeso: Tipo II",R.drawable.ic_error))
    listado.add(Imc(">40.00","Obeso: Tipo III",R.drawable.ic_error))
    return listado
}