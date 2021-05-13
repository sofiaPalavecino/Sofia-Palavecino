import pandas as pd

import matplotlib.pyplot as plt1
import matplotlib.pyplot as plt2

df=pd.read_csv("autorizaciones.csv")

valores_x=df["Cantidad_Autorizaciones"]
valores_Y=df["Año"]
