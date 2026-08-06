from pathlib import Path

ruta = Path(__file__).parent
cantidad = 30

for i in range(1, cantidad + 1):
    (ruta / f"c{i:03d}").mkdir(exist_ok=True)

print("Carpetas creadas.")