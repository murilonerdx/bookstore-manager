--
-- PostgreSQL database dump
--

-- Dumped from database version 13.1
-- Dumped by pg_dump version 13.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- Data for Name: flyway_schema_history; Type: TABLE DATA; Schema: migrations; Owner: postgres
--

INSERT INTO migrations.flyway_schema_history (installed_rank, version, description, type, script, checksum, installed_by, installed_on, execution_time, success) VALUES (0, NULL, '<< Flyway Schema Creation >>', 'SCHEMA', '"migrations"', NULL, 'postgres', '2021-03-09 15:53:49.975617', 0, true);


--
-- Data for Name: categoria; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.categoria (id, nome) VALUES (1, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (2, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (3, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (4, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (5, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (6, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (7, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (8, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (9, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (10, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (11, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (12, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (13, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (14, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (15, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (16, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (17, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (18, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (19, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (20, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (21, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (22, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (23, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (24, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (25, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (26, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (27, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (28, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (29, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (30, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (31, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (32, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (33, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (34, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (35, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (36, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (37, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (38, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (39, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (40, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (41, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (42, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (43, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (44, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (45, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (46, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (47, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (48, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (49, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (50, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (51, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (52, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (53, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (54, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (55, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (56, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (57, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (58, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (59, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (60, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (61, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (62, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (63, 'Perfumaria');
INSERT INTO public.categoria (id, nome) VALUES (64, 'Informática');
INSERT INTO public.categoria (id, nome) VALUES (65, 'Escritório');
INSERT INTO public.categoria (id, nome) VALUES (66, 'Cama mesa e banho');
INSERT INTO public.categoria (id, nome) VALUES (67, 'Eletrônicos');
INSERT INTO public.categoria (id, nome) VALUES (68, 'Jardinagem');
INSERT INTO public.categoria (id, nome) VALUES (69, 'Decoração');
INSERT INTO public.categoria (id, nome) VALUES (70, 'Perfumaria');


--
-- Data for Name: estado; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.estado (id, nome) VALUES (1, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (2, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (3, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (4, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (5, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (6, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (7, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (8, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (9, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (10, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (11, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (12, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (13, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (14, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (15, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (16, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (17, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (18, 'São Paulo');
INSERT INTO public.estado (id, nome) VALUES (19, 'Minas Gerais');
INSERT INTO public.estado (id, nome) VALUES (20, 'São Paulo');


--
-- Data for Name: cidade; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cidade (id, nome, estado_id) VALUES (1, 'Uberlândia', 1);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (2, 'São Paulo', 2);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (3, 'Campinas', 2);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (4, 'Uberlândia', 3);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (5, 'São Paulo', 4);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (6, 'Campinas', 4);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (7, 'Uberlândia', 5);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (8, 'São Paulo', 6);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (9, 'Campinas', 6);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (10, 'Uberlândia', 7);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (11, 'São Paulo', 8);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (12, 'Campinas', 8);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (13, 'Uberlândia', 9);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (14, 'São Paulo', 10);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (15, 'Campinas', 10);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (16, 'Uberlândia', 11);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (17, 'São Paulo', 12);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (18, 'Campinas', 12);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (19, 'Uberlândia', 13);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (20, 'São Paulo', 14);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (21, 'Campinas', 14);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (22, 'Uberlândia', 15);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (23, 'São Paulo', 16);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (24, 'Campinas', 16);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (25, 'Uberlândia', 17);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (26, 'São Paulo', 18);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (27, 'Campinas', 18);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (28, 'Uberlândia', 19);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (29, 'São Paulo', 20);
INSERT INTO public.cidade (id, nome, estado_id) VALUES (30, 'Campinas', 20);


--
-- Data for Name: cliente; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cliente (id, cpf_ou_cnpj, email, nome, tipo) VALUES (1, '36378912377', 'maria@gmail.com', 'Maria Silva', 1);
INSERT INTO public.cliente (id, cpf_ou_cnpj, email, nome, tipo) VALUES (6, '36378912377', 'nelio.cursos@gmail.com', 'Maria Silva', 1);
INSERT INTO public.cliente (id, cpf_ou_cnpj, email, nome, tipo) VALUES (7, '31628382740', 'nelio.iftm@gmail.com', 'Ana Costa', 1);


--
-- Data for Name: endereco; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, cliente_id) VALUES (1, 'Jardim', '38220834', 'Apto 303', 'Rua Flores', '300', 1, 1);
INSERT INTO public.endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, cliente_id) VALUES (2, 'Centro', '38777012', 'Sala 800', 'Avenida Matos', '105', 2, 1);
INSERT INTO public.endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, cliente_id) VALUES (3, 'Jardim', '38220834', 'Apto 303', 'Rua Flores', '300', 16, 6);
INSERT INTO public.endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, cliente_id) VALUES (4, 'Centro', '38777012', 'Sala 800', 'Avenida Matos', '105', 17, 6);
INSERT INTO public.endereco (id, bairro, cep, complemento, logradouro, numero, cidade_id, cliente_id) VALUES (5, 'Centro', '281777012', NULL, 'Avenida Floriano', '2106', 17, 7);


--
-- Data for Name: pedido; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pedido (id, instante, cliente_id, endereco_de_entrega_id) VALUES (1, '2017-09-30 10:32:00', 1, 1);
INSERT INTO public.pedido (id, instante, cliente_id, endereco_de_entrega_id) VALUES (2, '2017-10-10 19:35:00', 1, 2);
INSERT INTO public.pedido (id, instante, cliente_id, endereco_de_entrega_id) VALUES (3, '2017-09-30 10:32:00', 6, 3);
INSERT INTO public.pedido (id, instante, cliente_id, endereco_de_entrega_id) VALUES (4, '2017-10-10 19:35:00', 6, 4);


--
-- Data for Name: produto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.produto (id, nome, preco) VALUES (1, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (2, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (3, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (4, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (5, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (6, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (7, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (8, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (9, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (10, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (11, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (12, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (13, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (14, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (15, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (16, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (17, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (18, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (19, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (20, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (21, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (22, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (23, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (24, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (25, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (26, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (27, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (28, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (29, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (30, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (31, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (32, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (33, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (34, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (35, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (36, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (37, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (38, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (39, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (40, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (41, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (42, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (43, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (44, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (45, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (46, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (47, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (48, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (49, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (50, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (51, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (52, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (53, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (54, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (55, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (56, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (57, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (58, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (59, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (60, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (61, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (62, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (63, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (64, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (65, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (66, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (67, 'Produto 12', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (68, 'Produto 13', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (69, 'Produto 14', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (70, 'Produto 15', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (71, 'Produto 16', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (72, 'Produto 17', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (73, 'Produto 18', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (74, 'Produto 19', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (75, 'Produto 20', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (76, 'Produto 21', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (77, 'Produto 22', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (78, 'Produto 23', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (79, 'Produto 24', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (80, 'Produto 25', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (81, 'Produto 26', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (82, 'Produto 27', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (83, 'Produto 28', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (84, 'Produto 29', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (85, 'Produto 30', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (86, 'Produto 31', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (87, 'Produto 32', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (88, 'Produto 33', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (89, 'Produto 34', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (90, 'Produto 35', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (91, 'Produto 36', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (92, 'Produto 37', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (93, 'Produto 38', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (94, 'Produto 39', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (95, 'Produto 40', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (96, 'Produto 41', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (97, 'Produto 42', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (98, 'Produto 43', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (99, 'Produto 44', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (100, 'Produto 45', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (101, 'Produto 46', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (102, 'Produto 47', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (103, 'Produto 48', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (104, 'Produto 49', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (105, 'Produto 50', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (106, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (107, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (108, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (109, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (110, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (111, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (112, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (113, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (114, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (115, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (116, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (117, 'Produto 12', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (118, 'Produto 13', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (119, 'Produto 14', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (120, 'Produto 15', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (121, 'Produto 16', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (122, 'Produto 17', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (123, 'Produto 18', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (124, 'Produto 19', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (125, 'Produto 20', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (126, 'Produto 21', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (127, 'Produto 22', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (128, 'Produto 23', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (129, 'Produto 24', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (130, 'Produto 25', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (131, 'Produto 26', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (132, 'Produto 27', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (133, 'Produto 28', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (134, 'Produto 29', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (135, 'Produto 30', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (136, 'Produto 31', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (137, 'Produto 32', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (138, 'Produto 33', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (139, 'Produto 34', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (140, 'Produto 35', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (141, 'Produto 36', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (142, 'Produto 37', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (143, 'Produto 38', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (144, 'Produto 39', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (145, 'Produto 40', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (146, 'Produto 41', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (147, 'Produto 42', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (148, 'Produto 43', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (149, 'Produto 44', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (150, 'Produto 45', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (151, 'Produto 46', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (152, 'Produto 47', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (153, 'Produto 48', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (154, 'Produto 49', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (155, 'Produto 50', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (156, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (157, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (158, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (159, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (160, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (161, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (162, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (163, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (164, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (165, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (166, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (167, 'Produto 12', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (168, 'Produto 13', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (169, 'Produto 14', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (170, 'Produto 15', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (171, 'Produto 16', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (172, 'Produto 17', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (173, 'Produto 18', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (174, 'Produto 19', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (175, 'Produto 20', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (176, 'Produto 21', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (177, 'Produto 22', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (178, 'Produto 23', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (179, 'Produto 24', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (180, 'Produto 25', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (181, 'Produto 26', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (182, 'Produto 27', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (183, 'Produto 28', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (184, 'Produto 29', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (185, 'Produto 30', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (186, 'Produto 31', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (187, 'Produto 32', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (188, 'Produto 33', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (189, 'Produto 34', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (190, 'Produto 35', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (191, 'Produto 36', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (192, 'Produto 37', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (193, 'Produto 38', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (194, 'Produto 39', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (195, 'Produto 40', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (196, 'Produto 41', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (197, 'Produto 42', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (198, 'Produto 43', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (199, 'Produto 44', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (200, 'Produto 45', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (201, 'Produto 46', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (202, 'Produto 47', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (203, 'Produto 48', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (204, 'Produto 49', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (205, 'Produto 50', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (206, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (207, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (208, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (209, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (210, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (211, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (212, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (213, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (214, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (215, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (216, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (217, 'Produto 12', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (218, 'Produto 13', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (219, 'Produto 14', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (220, 'Produto 15', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (221, 'Produto 16', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (222, 'Produto 17', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (223, 'Produto 18', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (224, 'Produto 19', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (225, 'Produto 20', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (226, 'Produto 21', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (227, 'Produto 22', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (228, 'Produto 23', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (229, 'Produto 24', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (230, 'Produto 25', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (231, 'Produto 26', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (232, 'Produto 27', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (233, 'Produto 28', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (234, 'Produto 29', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (235, 'Produto 30', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (236, 'Produto 31', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (237, 'Produto 32', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (238, 'Produto 33', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (239, 'Produto 34', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (240, 'Produto 35', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (241, 'Produto 36', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (242, 'Produto 37', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (243, 'Produto 38', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (244, 'Produto 39', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (245, 'Produto 40', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (246, 'Produto 41', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (247, 'Produto 42', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (248, 'Produto 43', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (249, 'Produto 44', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (250, 'Produto 45', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (251, 'Produto 46', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (252, 'Produto 47', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (253, 'Produto 48', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (254, 'Produto 49', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (255, 'Produto 50', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (256, 'Computador', 2000);
INSERT INTO public.produto (id, nome, preco) VALUES (257, 'Impressora', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (258, 'Mouse', 80);
INSERT INTO public.produto (id, nome, preco) VALUES (259, 'Mesa de escritório', 300);
INSERT INTO public.produto (id, nome, preco) VALUES (260, 'Toalha', 50);
INSERT INTO public.produto (id, nome, preco) VALUES (261, 'Colcha', 200);
INSERT INTO public.produto (id, nome, preco) VALUES (262, 'TV true color', 1200);
INSERT INTO public.produto (id, nome, preco) VALUES (263, 'Roçadeira', 800);
INSERT INTO public.produto (id, nome, preco) VALUES (264, 'Abajour', 100);
INSERT INTO public.produto (id, nome, preco) VALUES (265, 'Pendente', 180);
INSERT INTO public.produto (id, nome, preco) VALUES (266, 'Shampoo', 90);
INSERT INTO public.produto (id, nome, preco) VALUES (267, 'Produto 12', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (268, 'Produto 13', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (269, 'Produto 14', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (270, 'Produto 15', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (271, 'Produto 16', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (272, 'Produto 17', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (273, 'Produto 18', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (274, 'Produto 19', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (275, 'Produto 20', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (276, 'Produto 21', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (277, 'Produto 22', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (278, 'Produto 23', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (279, 'Produto 24', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (280, 'Produto 25', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (281, 'Produto 26', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (282, 'Produto 27', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (283, 'Produto 28', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (284, 'Produto 29', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (285, 'Produto 30', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (286, 'Produto 31', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (287, 'Produto 32', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (288, 'Produto 33', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (289, 'Produto 34', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (290, 'Produto 35', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (291, 'Produto 36', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (292, 'Produto 37', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (293, 'Produto 38', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (294, 'Produto 39', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (295, 'Produto 40', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (296, 'Produto 41', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (297, 'Produto 42', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (298, 'Produto 43', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (299, 'Produto 44', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (300, 'Produto 45', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (301, 'Produto 46', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (302, 'Produto 47', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (303, 'Produto 48', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (304, 'Produto 49', 10);
INSERT INTO public.produto (id, nome, preco) VALUES (305, 'Produto 50', 10);


--
-- Data for Name: item_pedido; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.item_pedido (desconto, preco, quantidade, pedido_id, produto_id) VALUES (0, 2000, 1, 1, 1);
INSERT INTO public.item_pedido (desconto, preco, quantidade, pedido_id, produto_id) VALUES (0, 80, 2, 1, 3);
INSERT INTO public.item_pedido (desconto, preco, quantidade, pedido_id, produto_id) VALUES (100, 800, 1, 2, 2);
INSERT INTO public.item_pedido (desconto, preco, quantidade, pedido_id, produto_id) VALUES (0, 2000, 1, 3, 56);
INSERT INTO public.item_pedido (desconto, preco, quantidade, pedido_id, produto_id) VALUES (0, 80, 2, 3, 58);
INSERT INTO public.item_pedido (desconto, preco, quantidade, pedido_id, produto_id) VALUES (100, 800, 1, 4, 57);


--
-- Data for Name: pagamento; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pagamento (pedido_id, estado) VALUES (1, 2);
INSERT INTO public.pagamento (pedido_id, estado) VALUES (2, 1);
INSERT INTO public.pagamento (pedido_id, estado) VALUES (3, 2);
INSERT INTO public.pagamento (pedido_id, estado) VALUES (4, 1);


--
-- Data for Name: pagamento_com_boleto; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pagamento_com_boleto (data_pagamento, data_vencimento, pedido_id) VALUES (NULL, '2017-10-20 00:00:00', 2);
INSERT INTO public.pagamento_com_boleto (data_pagamento, data_vencimento, pedido_id) VALUES (NULL, '2017-10-20 00:00:00', 4);


--
-- Data for Name: pagamento_com_cartao; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.pagamento_com_cartao (numero_de_parcelas, pedido_id) VALUES (6, 1);
INSERT INTO public.pagamento_com_cartao (numero_de_parcelas, pedido_id) VALUES (6, 3);


--
-- Data for Name: produto_categoria; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (1, 1);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (1, 1);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (1, 4);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (2, 1);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (2, 2);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (2, 1);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (2, 2);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (2, 4);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (3, 1);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (3, 1);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (3, 4);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (4, 2);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (5, 3);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (6, 3);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (7, 4);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (8, 5);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (9, 6);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (10, 6);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (11, 7);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (12, 8);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (12, 8);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (12, 11);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (13, 8);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (13, 9);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (13, 8);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (13, 9);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (13, 11);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (14, 8);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (14, 8);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (14, 11);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (15, 9);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (16, 10);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (17, 10);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (18, 11);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (19, 12);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (20, 13);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (21, 13);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (22, 14);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (23, 15);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (23, 15);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (23, 18);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (24, 15);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (24, 16);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (24, 15);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (24, 16);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (24, 18);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (25, 15);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (25, 15);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (25, 18);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (26, 16);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (27, 17);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (28, 17);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (29, 18);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (30, 19);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (31, 20);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (32, 20);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (33, 21);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (34, 22);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (34, 22);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (34, 25);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (35, 22);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (35, 23);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (35, 22);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (35, 23);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (35, 25);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (36, 22);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (36, 22);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (36, 25);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (37, 23);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (38, 24);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (39, 24);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (40, 25);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (41, 26);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (42, 27);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (43, 27);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (44, 28);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (45, 29);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (45, 29);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (45, 32);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (46, 29);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (46, 30);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (46, 29);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (46, 30);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (46, 32);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (47, 29);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (47, 29);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (47, 32);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (48, 30);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (49, 31);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (50, 31);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (51, 32);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (52, 33);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (53, 34);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (54, 34);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (55, 35);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (56, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (56, 39);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (57, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (57, 37);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (57, 39);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (58, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (58, 39);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (59, 37);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (60, 38);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (61, 38);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (62, 39);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (63, 40);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (64, 41);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (65, 41);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (66, 42);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (67, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (68, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (69, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (70, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (71, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (72, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (73, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (74, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (75, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (76, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (77, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (78, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (79, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (80, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (81, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (82, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (83, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (84, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (85, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (86, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (87, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (88, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (89, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (90, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (91, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (92, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (93, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (94, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (95, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (96, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (97, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (98, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (99, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (100, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (101, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (102, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (103, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (104, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (105, 36);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (106, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (106, 46);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (107, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (107, 44);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (107, 46);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (108, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (108, 46);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (109, 44);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (110, 45);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (111, 45);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (112, 46);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (113, 47);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (114, 48);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (115, 48);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (116, 49);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (117, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (118, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (119, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (120, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (121, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (122, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (123, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (124, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (125, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (126, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (127, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (128, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (129, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (130, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (131, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (132, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (133, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (134, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (135, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (136, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (137, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (138, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (139, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (140, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (141, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (142, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (143, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (144, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (145, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (146, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (147, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (148, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (149, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (150, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (151, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (152, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (153, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (154, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (155, 43);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (156, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (156, 53);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (157, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (157, 51);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (157, 53);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (158, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (158, 53);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (159, 51);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (160, 52);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (161, 52);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (162, 53);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (163, 54);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (164, 55);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (165, 55);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (166, 56);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (167, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (168, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (169, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (170, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (171, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (172, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (173, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (174, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (175, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (176, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (177, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (178, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (179, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (180, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (181, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (182, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (183, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (184, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (185, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (186, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (187, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (188, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (189, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (190, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (191, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (192, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (193, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (194, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (195, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (196, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (197, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (198, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (199, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (200, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (201, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (202, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (203, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (204, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (205, 50);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (206, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (206, 60);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (207, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (207, 58);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (207, 60);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (208, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (208, 60);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (209, 58);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (210, 59);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (211, 59);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (212, 60);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (213, 61);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (214, 62);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (215, 62);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (216, 63);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (217, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (218, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (219, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (220, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (221, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (222, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (223, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (224, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (225, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (226, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (227, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (228, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (229, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (230, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (231, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (232, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (233, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (234, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (235, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (236, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (237, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (238, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (239, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (240, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (241, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (242, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (243, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (244, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (245, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (246, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (247, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (248, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (249, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (250, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (251, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (252, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (253, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (254, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (255, 57);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (256, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (256, 67);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (257, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (257, 65);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (257, 67);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (258, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (258, 67);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (259, 65);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (260, 66);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (261, 66);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (262, 67);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (263, 68);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (264, 69);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (265, 69);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (266, 70);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (267, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (268, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (269, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (270, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (271, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (272, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (273, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (274, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (275, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (276, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (277, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (278, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (279, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (280, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (281, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (282, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (283, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (284, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (285, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (286, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (287, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (288, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (289, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (290, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (291, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (292, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (293, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (294, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (295, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (296, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (297, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (298, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (299, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (300, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (301, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (302, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (303, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (304, 64);
INSERT INTO public.produto_categoria (produto_id, categoria_id) VALUES (305, 64);


--
-- Data for Name: telefone; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.telefone (cliente_id, telefones) VALUES (1, '27363323');
INSERT INTO public.telefone (cliente_id, telefones) VALUES (1, '93838393');
INSERT INTO public.telefone (cliente_id, telefones) VALUES (6, '27363323');
INSERT INTO public.telefone (cliente_id, telefones) VALUES (6, '93838393');
INSERT INTO public.telefone (cliente_id, telefones) VALUES (7, '93883321');
INSERT INTO public.telefone (cliente_id, telefones) VALUES (7, '34252625');


--
-- Name: categoria_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.categoria_id_seq', 70, true);


--
-- Name: cidade_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cidade_id_seq', 30, true);


--
-- Name: cliente_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cliente_id_seq', 11, true);


--
-- Name: endereco_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.endereco_id_seq', 5, true);


--
-- Name: estado_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.estado_id_seq', 20, true);


--
-- Name: pedido_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.pedido_id_seq', 4, true);


--
-- Name: produto_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.produto_id_seq', 305, true);


--
-- PostgreSQL database dump complete
--

