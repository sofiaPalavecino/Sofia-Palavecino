import pandas as pd

import csv

df=pd.read_csv("casosDeDengueYZika.csv")

print(df[:300],df[-200:])
print(df.iloc[:,-1:])


def eliminarDuplicadas(df):
    sinDuplicados = df.drop_duplicates()
    print("Columnas duplicadas eliminadas")

def eliminarVacios(df):
    sinNan = df.dropna()
    print("Columnas vacías eliminadas")

def nuevoCsv(df):
    print("ingresar nombre del archivo")
    nombre=input()
    df.to_csv(nombre+".csv")
    nuevoCsv=pd.read_csv(nombre+".csv")
    print(nuevoCsv)

def imprimirColumna(df):
    print(list(df.columns))
    print("elegir columna")
    columna=input()
    print(df[columna])

print(df.loc[[1,5,12,36]])






